package com.spring.springsecutiryapp.service;

import com.spring.springsecutiryapp.dto.UserResponse;
import com.spring.springsecutiryapp.model.User;

public interface UsuarioService {

    UserResponse salvar(User user);

}
