package com.darkcommit.learn_spring_security;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/private")
public class PrivateController {
    @GetMapping
    public String getPrivate() {
        return "This is a private endpoint";
    }
}
