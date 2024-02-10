package Operators2;

import java.util.Scanner;
/*
 * Program Bank has a features to approve or denied apply loan amount
 * If the user loan amount is less than the bank available money then loan will be approved
 * if loan amount exceeds the bank money, the loan will be denied
 */

public class Bank {

	// Declaring and Initializing the variable of bank...(bank has a money)
	double bankMoney = 200000.00;// Bank has two hundred thousand money available

	/// Creating a method apply loan

	public boolean applyLoan(double loanAmount) {

		// if loan amount is less than bank money then return true
		if (loanAmount < bankMoney) {
			System.out.println("Congratulations your Loan amount $" + loanAmount + " approved.");
			return true;
		} else {
			System.out.println("Sorry we can not approve your loan this time! Please select less loan amount.");
			return false;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new Bank();
		System.out.println("Please enter the amount of loan you want:");
		Scanner sc = new Scanner(System.in);
		double loanAmount = sc.nextDouble();

		bank.applyLoan(loanAmount);

	}
}
