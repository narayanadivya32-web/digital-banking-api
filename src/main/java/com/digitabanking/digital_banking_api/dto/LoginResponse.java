package com.digitabanking.digital_banking_api.dto;

public class LoginResponse {

    private String message;

    private String customerId;

    private String token;


    public LoginResponse(String message,String customerId,String token){
        this.message=message;
        this.customerId=customerId;
        this.token=token;


    }

    public String getMessage() {
        return message;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getToken(){
        return token;
    }

}
