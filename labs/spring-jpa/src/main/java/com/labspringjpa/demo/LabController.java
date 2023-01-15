package com.labspringjpa.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/lab5")
public class LabController {
    @Autowired // This means to get the bean called userRepository
// Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @GetMapping(path="/add") //
    public @ResponseBody String addUser (@RequestParam  String name, @RequestParam String
email) {
        User n = new User();
        n.setName (name);
        n.setEmail(email);
        userRepository.save(n);
        return "User Saved";
    }
    @GetMapping (path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
// This returns a JSON or XML with the users
        return userRepository.findAll();
    }
//add Methods for the CDomainClass
//addCDomainClass
//getAllCDomainClass
}