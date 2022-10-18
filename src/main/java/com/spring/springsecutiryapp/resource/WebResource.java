package com.spring.springsecutiryapp.resource;

import com.spring.springsecutiryapp.dto.UserRequest;
import com.spring.springsecutiryapp.dto.UserResponse;
import com.spring.springsecutiryapp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class WebResource {

    @Autowired
    private UsuarioService service;

    @PostMapping
    public ResponseEntity<UserResponse> registrar(@RequestBody @Valid UserRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(request.toDomain()));
    }

}
