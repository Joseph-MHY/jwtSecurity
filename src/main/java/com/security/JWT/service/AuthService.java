package com.security.JWT.service;

import com.security.JWT.model.DTO.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
