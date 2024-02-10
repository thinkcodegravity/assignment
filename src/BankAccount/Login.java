package BankAccount;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("Welcome to XyZ BAnk");
		System.out.println("Please enter your pin:");
		java.util.Scanner sc = new Scanner(System.in);
		int customerInputPin = sc.nextInt();
//Creating reference ba to the AankAccount class
		BankAccount ba = new BankAccount();
		boolean status = ba.verifyPin(customerInputPin);
		if (status == true) {
			System.out.println("How can I help you today?");
			//Using while loop for the repetitive options if the user input id not satisfied
			while (true) {
				System.out.println("Please press 1 for withdraw, 2 for deposit and 3 for balance inquiry");
				int option = sc.nextInt();
				if (option == 1) {
					System.out.println("Available Account Balance: $"+ba.balance);
					System.out.println("Please enter withdraw amount:");
					double enteredAmount = sc.nextInt();
					if (enteredAmount <= ba.balance) {
						System.out.println("Your withdraw of $" + enteredAmount + " is successful!");
						System.out.println("Your new account balance is $" + ba.Withdraw(enteredAmount));
						break;
					} else {
						System.out.println("Insuffient Balance!");
						break;

					}
				} else if (option == 2) {
					System.out.println("Available Account Balance: $"+ba.balance);
					System.out.println("Please enter your deposit amount:");
					double enteredAmount = sc.nextInt();
					if (enteredAmount <= 10000) {
						System.out.println("$" + enteredAmount + " deposited sucessfully");
						System.out.println("Your new account balance is $" + ba.Deposit(enteredAmount));
						break;
					} else {
						System.out.println("Amount exceeds the atm deposit limit.please see cashier");
						break;
					}
				}

				else if (option == 3) {
					System.out.println("Your balance is " + ba.balance);
					break;
				} else {
					System.out.println("Invalid Choice");

				}
			}
		} else {
			System.out.println("Invalid Pin! Please Try Again");
		}

	}
}
