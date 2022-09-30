package Operators;

public class Bank {

	double balance = 10000.0;

	public void depositBalance(double depositBalance) {
		balance = balance + depositBalance;
		System.out.println("Deposit of " + depositBalance + " made. New balance is " + balance);
	}

	public void withDrawBalance(double withDrawalBalance) {
		if (balance - withDrawalBalance < 0) {
			System.out.println("Only " + balance + " available. Withdrawal not proceed.");
		} else {
			balance -= withDrawalBalance;
			System.out.println("Withdrawal of " + withDrawalBalance + " proceed. Remaining balance = " + this.balance);
		}
	}

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.depositBalance(1000.0);
		bank.withDrawBalance(2000);
		bank.withDrawBalance(10000);
	}

}
