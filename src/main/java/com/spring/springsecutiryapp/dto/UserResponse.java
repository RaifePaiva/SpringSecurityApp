package com.spring.springsecutiryapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class UserResponse {

    private UUID id;
    private String username;
    private LocalDateTime dataCriacao;

    public UserResponse() {
    }

    public UserResponse(UUID id, String username, LocalDateTime dataCriacao) {
        this.id = id;
        this.username = username;
        this.dataCriacao = dataCriacao;
    }

}
