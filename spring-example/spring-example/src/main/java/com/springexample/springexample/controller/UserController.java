package com.springexample.springexample.controller;


import com.springexample.springexample.model.dto.UserDTO;
import com.springexample.springexample.model.entity.User;
import com.springexample.springexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("user")
@RequiredArgsConstructor

public class UserController {

    private final UserService userService;



    @GetMapping
    public List<User> findAll() {
        return userService.retrieveAllUser();
    }

    @GetMapping("/{firstName}")
    public List<User> findByFirstName(@PathVariable("firstName") String firstName) {
        return userService.retrieveUsersByFirstName(firstName);
    }

    @PostMapping
    public User storeUser(@RequestBody User user) {
        return userService.storeUser(user);
    }




}
