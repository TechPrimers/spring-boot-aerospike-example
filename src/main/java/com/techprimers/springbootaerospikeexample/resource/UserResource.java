package com.techprimers.springbootaerospikeexample.resource;


import com.techprimers.springbootaerospikeexample.model.User;
import com.techprimers.springbootaerospikeexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {

        return userService.getAll();
    }


    @PostMapping
    public List<User> create(@RequestBody final User user){

        userService.create(user);

        return userService.getAll();
    }
}
