package com.spring.springsecutiryapp.dto;

import com.spring.springsecutiryapp.model.User;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UserRequest {

    private String username;
    private String senha;

    public User toDomain(){
        return new User(username, senha);
    }

}
