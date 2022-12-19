package com.example.lab04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/lab4")
public class LabController {

    @GetMapping(path = "/add")
    public @ResponseBody String addUser(@RequestParam String name, @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        return n.toString();
    }

    @GetMapping(path = "/addDomainObject")
    public @ResponseBody String addDomainObject(@RequestParam String model, @RequestParam String company) {
        Airplane airplane = new Airplane();
        airplane.setModel(model);
        airplane.setCompany(company);
        return airplane.toJson();
    }
}
