package com.digitabanking.digital_banking_api.service;

import com.digitabanking.digital_banking_api.dto.LoginResponse;
import com.digitabanking.digital_banking_api.security.JwtService;
import org.aspectj.weaver.patterns.IToken;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final JwtService jwtService;

    public AuthService(JwtService jwtService){
        this.jwtService=jwtService;
    }

    public LoginResponse login(String customerId, String password) {


        if ("CUST1001".equals(customerId)
                && "password123".equals(password)) {

            String token = jwtService.generateToken(customerId);

            return new LoginResponse(
                    "Login successful",
                    customerId,
                    token
            );
        }

        throw new RuntimeException("Invalid customerId or password");
    }
}
