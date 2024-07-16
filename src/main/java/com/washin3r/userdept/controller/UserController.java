package com.washin3r.userdept.controller;

import com.washin3r.userdept.entities.User;
import com.washin3r.userdept.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Id do usuário inválido: " + id));
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return userRepository.save(user);
    }

}
