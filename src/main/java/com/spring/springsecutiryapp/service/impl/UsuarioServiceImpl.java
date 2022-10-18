package com.spring.springsecutiryapp.service.impl;

import com.spring.springsecutiryapp.dto.UserResponse;
import com.spring.springsecutiryapp.model.User;
import com.spring.springsecutiryapp.repository.UserRespository;
import com.spring.springsecutiryapp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UserRespository repository;

    @Override
    public UserResponse salvar(User user) {
        var domain = repository.save(user);
        return new UserResponse(domain.getId(), domain.getUsername(), domain.getDataCriacao());
    }
}
