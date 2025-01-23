package com.sl.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.entity.User;
import com.sl.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User signUp(User user) {
//        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
//            throw new RuntimeException("User already exists");
//        }
        return userRepository.save(user);
    }

    public boolean login(String username, String password) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.isPresent() && user.get().getPassword().equals(password);
    }
}
