package com.oops;

public class Bank {

	// Creating the Instance variable
	String bankName;
	String accountHolder;
	double balance;
	
	// Method 1
	public void deposit() {
		System.out.println("The amount is deposited");
		
	}
	
	// Method 2
	public void withdraw(double amount) {
		System.out.println("The " +amount + "is with drawn");
		
	}
	
	
	//Method 3
	public void checkBalance() {
		System.out.println("The balance is checked!!");
		
	}
	
	//Main Method
	public static void main(String[] args) {
		
		// create the instance of bank
		Bank myBank = new Bank();
		
		//set the instance variable
		myBank.bankName = "Bank of America";
		myBank.accountHolder = "Srijana Raut";
		myBank.balance = 790000.0;
		
		System.out.println("My account balance is:" +myBank.balance);
		System.out.println("The account holder name is" +myBank.accountHolder + "from bank" +myBank.bankName);
		
		myBank.deposit();
		myBank.withdraw(200); // we need to pass the amount 
		myBank.checkBalance();
		
	}
}
