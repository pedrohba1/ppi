package com.example.demo.controller;


import com.example.demo.dto.BuyDto;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import extension.ProductException;
import extension.UserException;
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
@RequestMapping("/buy")
public class BuyController {


    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @PostMapping("{productId}")
    public ResponseEntity<Object> createProduct(
            @PathVariable String productId,
            @RequestBody @Valid BuyDto buyDto,
            Authentication authentication
    ) {
        UUID userUuid = UUID.fromString((String) authentication.getPrincipal());
        Optional<User> optionalUser = userService.findById(userUuid);
        if(optionalUser.isEmpty()){
            throw new UserException("user does not exist");
        }
        UUID productUuid = UUID.fromString(productId);
        Optional<Product> optProduct = productService.findById(productUuid);
        if(optProduct.isEmpty()){
            throw new ProductException("product does not exist");
        }
        Product product = optProduct.get();
        product.setBuyer(optionalUser.get());
        product.setTxnHash(buyDto.getTransactionHash());
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.save(product));
    }

}
