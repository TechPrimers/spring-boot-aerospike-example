package com.techprimers.springbootaerospikeexample.service;

import com.techprimers.springbootaerospikeexample.model.User;
import com.techprimers.springbootaerospikeexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll()
                .forEach(users::add);
        return users;
    }

    public void create(User user) {
        userRepository.save(user);
    }
}
