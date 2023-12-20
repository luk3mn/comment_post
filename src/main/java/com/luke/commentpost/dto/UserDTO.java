package com.luke.commentpost.dto;

import java.io.Serializable;

import com.luke.commentpost.domain.User;

public class UserDTO implements Serializable {
    
    private String id;
    private String name;
    private String email;

    public UserDTO() {
    }

    // To be able instance using entity object
    public UserDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
