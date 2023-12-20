package com.luke.commentpost.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.luke.commentpost.domain.User;
import com.luke.commentpost.repository.UserRepository;

@Configuration // in order to spring know that this class is a configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll(); // delete all data in user collection on mongodb before doing test insert

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Gray", "bob@gmail.com");
        
        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
    
}
