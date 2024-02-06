package com.operators;

//Create bank program
//(has-a)Declare global variable bank money
//Create applyLoan method takes loan amount input. If customer requesting loan amount is less than bank available money then print loan approved or denied.

public class BankProgram {
	//global variable with static
    private static double bankMoney = 100000; // Example amount

    public static void applyLoan(double loanAmount) {
        if (loanAmount <= bankMoney) {
            System.out.println("Loan approved!!");
        } else {
            System.out.println("Loan denied!!");
        }
    }

    public static void main(String[] args) {
        applyLoan(50000); // Example usage of Loan approved
    }
}

