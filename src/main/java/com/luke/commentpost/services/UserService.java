package com.luke.commentpost.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luke.commentpost.domain.User;
import com.luke.commentpost.repository.UserRepository;

@Service
public class UserService {  
    
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
