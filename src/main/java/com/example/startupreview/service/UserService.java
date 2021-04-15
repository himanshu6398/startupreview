package com.example.startupreview.service;

import com.example.startupreview.beans.User;
import com.example.startupreview.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long id) {
        return userRepository.findById(id);
    }

    public String verifySignin(User user) {
        List<User> u = userRepository.verifySignin(user.getEmail(), user.getPassword());
        if(u.size() > 0) {
            for(User u1 : u) {
                return u1.getRole();
            }
        }
        return null;
    }
}
