package com.digitabanking.digital_banking_api.repository;

import com.digitabanking.digital_banking_api.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepo extends JpaRepository<Customer,Long>{

    Optional<Customer> findByCustomerId(String customerId);
}
