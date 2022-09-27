package Operators;

public class Bank {

	// Initially bank balance is zero
	public double balance = 0;

	// deposit only cash
	public double deposit(double cash) {
		balance = balance + cash;
		return balance;
	}

	// deposit cash and check at the same time
	public double deposit(double cash, double check) {
		balance = balance + cash + check;
		return balance;
	}

	// deposit cash , check and transferring to your account at the same time
	public double deposit(double cash, double check, double Incomingtransfer) {
		balance = balance + cash + check + Incomingtransfer;
		return balance;
	}

	// withdraw your money
	public void withdraw(double withdraw) {
		if (balance >= withdraw) {
			balance = balance - withdraw;
			System.out.println("The remaining balance is: $" + balance);
		} else {
			System.out.println("Sorry, you only have: $" + balance + "in your account");
		}

	}

	public static void main(String[] args) {
		Bank mybank = new Bank();
		mybank.deposit(100); // here we deposit 100
		System.out.println(mybank.balance); // check my balance = 100

		mybank.withdraw(50); // withdraw 50

		mybank.withdraw(100); // withdraw: 100

	}

}
