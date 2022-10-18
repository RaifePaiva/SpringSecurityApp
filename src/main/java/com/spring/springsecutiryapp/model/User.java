package com.spring.springsecutiryapp.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String username;
    private String senha;
    private LocalDateTime dataCriacao = LocalDateTime.now();

    public User() {
    }

    public User(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }
}
