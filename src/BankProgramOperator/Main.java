package BankProgramOperator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Bank program 
			Has balance
			does withdraw functionality  - include inputs , return outputs and logic.
			does deposit functionality  - include inputs , return outputs and logic. */

		int balance = 1000;
		int withdrawAmount;
		int depositAmount;
		
		System.out.println("Enter withdraw amount");
		
		Scanner scan = new Scanner(System.in);
		withdrawAmount = scan.nextInt();
		
		Withdraw wd = new Withdraw();
		wd.withdraw(withdrawAmount, balance);

		
		System.out.println("Enter deposit amount");
		depositAmount = scan.nextInt();
		Deposit dt = new Deposit();
		dt.deposit(depositAmount, balance);




	}

}
