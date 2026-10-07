package com.digitabanking.digital_banking_api.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @GetMapping("/profile")
    public String getProfile(Authentication authentication) {

        String customerId = authentication.getName();

        return "Welcome " + customerId
                + ". You are successfully authenticated.";
    }
}