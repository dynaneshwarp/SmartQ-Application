package com.smartQ.smartQ.controller;

import org.springframework.web.bind.annotation.RestController;
import com.smartQ.smartQ.dto.*;

import com.smartQ.smartQ.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(

            @RequestBody
            RegisterRequestDto request
    ) {

        return authService
                .register(request);
    }

    @PostMapping("/login")
    public AuthResponseDto login(

            @RequestBody
            LoginRequestDto request
    ) {

        return authService
                .login(request);
    }
}

