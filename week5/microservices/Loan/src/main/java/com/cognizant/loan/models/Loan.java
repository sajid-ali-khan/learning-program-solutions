package com.cognizant.loan.models;

public record Loan(String number, String type, double loan, double emi, int tenure){
}
