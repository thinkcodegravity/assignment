package operators;

import java.util.Scanner;

//Bank program
//• Has balance
//• does withdraw functionality - include inputs , return outputs and logic.
//• does deposit functionality - include inputs , return outputs and logic.

public class BankProgram {
	float balance;
	public BankProgram(float balance) {
		this.balance=balance;
	}
	
	public float withdraw(float balance) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter amount to witdraw from your account");
		float withdrawAmount = scan.nextFloat();
		float remainingBalance = 0;
		if(balance>=withdrawAmount) {
			remainingBalance = balance-withdrawAmount;
			System.out.println("Withdrawn Successfully");
			return remainingBalance;
		}else {
			System.out.println("Not Enough balance");
			return balance;
		}
	}
	
	public float deposit(float balance) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the deposit amount");
		float depositAmount = scan.nextFloat();
		float total= balance+depositAmount;
		System.out.println("Deposited Successfully");
		return total;
	}
}
