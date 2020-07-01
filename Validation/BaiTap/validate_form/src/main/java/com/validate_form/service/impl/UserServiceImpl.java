package com.validate_form.service.impl;

import com.validate_form.model.User;
import com.validate_form.repository.UserRepository;
import com.validate_form.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
