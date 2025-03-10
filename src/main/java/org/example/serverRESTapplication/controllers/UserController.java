package org.example.serverRESTapplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.serverRESTapplication.services.RegistrationService;
import org.example.serverRESTapplication.domain.User;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private RegistrationService service;

    @GetMapping
    public List<User> userList() {
        return service.getAllUsers();
    }

    @PostMapping("/body")
    public String userAddFromBody(@RequestBody User user)
    {
        service.processRegistration(user);
        return "User added from body!";
    }

    @PostMapping("/parameters")
    public String userAddFromParam(
            @RequestParam String name,
            @RequestParam int age,
            @RequestParam String email) {
        service.processRegistration(name, age, email);
        return "User added from parameters!";
    }
}