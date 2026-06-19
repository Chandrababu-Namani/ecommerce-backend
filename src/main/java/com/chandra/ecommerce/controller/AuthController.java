package com.chandra.ecommerce.controller;

import com.chandra.ecommerce.dto.LoginRequest;
import com.chandra.ecommerce.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        System.out.println("**********I'm at authController Email: "+request.getEmail()+"Pwd: "+request.getPassword());
        return authService.login(request);
    }
}