package com.operators;

//Bank program 
//Has balance
//does withdraw functionality  - include inputs , return outputs and logic.
//does deposit functionality  - include inputs , return outputs and logic.

public class Bank {
	
	double balance; //initial balance
	
	public double withDraw(double amount) {
		if (amount > balance) {
			System.out.println("With drawn Success!!");
		}
		else {
			System.out.println("The amount with drawl is unsuccess!!");
		}
		
		
	}
	
	public double deposit() {
		
	}

}
