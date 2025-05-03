package com.darkcommit.learn_spring_security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthenticationService  {

  private final JwtService jwtService;

  public String authenticate(Authentication authentication){
    return jwtService.generateToken(authentication);
  }
}
