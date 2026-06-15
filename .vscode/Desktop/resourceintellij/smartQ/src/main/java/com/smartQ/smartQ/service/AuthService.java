package com.smartQ.smartQ.service;

import com.smartQ.smartQ.dto.AuthResponseDto;
import com.smartQ.smartQ.dto.LoginRequestDto;
import com.smartQ.smartQ.dto.RegisterRequestDto;

public interface AuthService {


    String register(
            RegisterRequestDto request
    );

    AuthResponseDto login(
            LoginRequestDto request
    );
}

