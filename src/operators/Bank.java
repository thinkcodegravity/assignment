package Operators;

import java.util.*;

public class Bank {
	
	int balance = 100;
	
	int bankMoney = 10000;
	
	public static void main(String[] args) {
		Bank bnk = new Bank();
		System.out.println(bnk.withdrawMoney(50));
		bnk.balance = bnk.withdrawMoney(42);
		
		System.out.println(bnk.depositMoney(25));
		
		System.out.println(bnk.applyLoan(2000));
		
		System.out.println("The remaining balance is " + bnk.bankMoney);
		
	}
	
	public int withdrawMoney(int amount) {
		balance = balance - amount;
		return balance;
	}
	
	public int depositMoney(int amount) {
		int newBalance = balance + amount;
		return newBalance;
	}
	
	public String applyLoan(int loanAmt) {
		if (loanAmt < bankMoney) {
			bankMoney = bankMoney - loanAmt;
			return "Your loan is approved";
		}
		return "Your loan is rejected.";
	}

}
