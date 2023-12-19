package com.luke.commentpost.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.luke.commentpost.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}
