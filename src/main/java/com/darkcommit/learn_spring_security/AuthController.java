package com.darkcommit.learn_spring_security;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
@AllArgsConstructor
public class AuthController {

  private final AuthenticationService authService;

  @PostMapping("/authenticate")
  public String authenticate(Authentication auth) {
      return authService.authenticate(auth);
  }

}
