package com.spring.springsecutiryapp.repository;

import com.spring.springsecutiryapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRespository extends JpaRepository<User, UUID> {
}
