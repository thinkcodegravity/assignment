package BankAccount;

public class BankAccount {
	//Declaring Variables
	String registeredUsername = "Sandesh24";
	int registeredPin = 7878;
	String registeredPassword = "Sandesh_24";
	double balance = 2500.0;

	// method to verify the pin entered from the user
	public boolean verifyPin(int enteredPin) {
		if (enteredPin == registeredPin) {
			return true;
		} else {
			return false;
		}
	}

//withdraw method
	public double Withdraw(double withdrawAmount) {
		this.balance = balance - withdrawAmount;
		return balance;
	}

//deposit method
	public double Deposit(double depositAmount) {
		this.balance = balance + depositAmount;
		return balance;
	}
}
