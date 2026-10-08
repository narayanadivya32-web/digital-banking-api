package com.digitabanking.digital_banking_api.service;

import com.digitabanking.digital_banking_api.dto.CustomerRegistrationRequest;
import com.digitabanking.digital_banking_api.entity.Customer;
import com.digitabanking.digital_banking_api.repository.CustomerRepo;
import org.springframework.security.crypto.password.PasswordEncoder;

public class CustomerService {

    private final CustomerRepo customerRepo;

    private final PasswordEncoder passwordEncoder;

    public CustomerService(CustomerRepo customerRepo, PasswordEncoder passwordEncoder){
        this.customerRepo=customerRepo;
        this.passwordEncoder=passwordEncoder;
    }

    public Customer customerRegister(CustomerRegistrationRequest customerRegistrationRequest){

        if(customerRepo.findByCustomerId(customerRegistrationRequest.getCustomerId())
                .isPresent()){

            throw  new RuntimeException("Customer Id already exist");
        }

        Customer customer = new Customer();

        customer.setCustomerId(customerRegistrationRequest.getCustomerId());
        customer.setName(customerRegistrationRequest.getName());
        customer.setEmail(customerRegistrationRequest.getPassword());

        customer.setPassword(passwordEncoder.encode(customerRegistrationRequest.getPassword()));

        customer.setPhone(customerRegistrationRequest.getPhone());

        customer.setStatus("ACTIVE");
        return customerRepo.save(customer);

    }
}
