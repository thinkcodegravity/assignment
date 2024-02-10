package Operators1;

public class Bank {
//Declaring band initializing variables of bank
	double balance = 2500.00;

//Creating a method for deposit
	public double Deposit(int depositAmount) {
		balance += depositAmount;
		System.out.println("Balance After Deposit: $" + balance);
		return balance;
	}

	// Creating a method for withdraw
	public double Withdraw(int withdrawAmount) {
		balance -= withdrawAmount;
		System.out.println("Balance After Withdraw: $" + balance);
		return balance;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bal = new Bank();
		bal.Deposit(500);
		bal.Withdraw(1000);
	}

}
