package com.example.demo.controller;


import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import extension.UserException;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @PostMapping("/create")
    public ResponseEntity<Object> createProduct(
            @RequestBody @Valid Product product,
            Authentication authentication
    ) {
        UUID id = UUID.fromString((String) authentication.getPrincipal());
        Optional<User> optionalUser = userService.findById(id);
        if(optionalUser.isEmpty()){
            throw new UserException("user does not exist");
        }
        product.setUser(optionalUser.get());

        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }



    @GetMapping()
    public ResponseEntity<Object> findProducts(
    ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.findALl());
    }



}
