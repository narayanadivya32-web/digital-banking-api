package com.digitabanking.digital_banking_api;

import com.digitabanking.digital_banking_api.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(SecurityConfig.class)
@SpringBootApplication
public class DigitalBankingApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalBankingApiApplication.class, args);
	}

}
