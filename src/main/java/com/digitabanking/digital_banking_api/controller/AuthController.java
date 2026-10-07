package com.digitabanking.digital_banking_api.controller;

import com.digitabanking.digital_banking_api.dto.LoginRequest;
import com.digitabanking.digital_banking_api.dto.LoginResponse;
import com.digitabanking.digital_banking_api.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/auth")

public class AuthController {


    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService=authService;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return authService.login(
                loginRequest.getCustomerId(),
                loginRequest.getPassword()
        );
    }

}
