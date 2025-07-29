package com.cognizant.loan.controllers;

import com.cognizant.loan.models.Loan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class LoanController {
    @GetMapping("loan/{number}")
    public Loan getLoan(String number){
        return new Loan("8019340853", "Current", 1234, 123, 2);
    }
}
