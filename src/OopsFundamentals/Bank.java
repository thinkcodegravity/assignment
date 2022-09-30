package OopsFundamentals;

public class Bank {

	public int accountNumber;
	public double balance;
	public String customerName;
	public String email;
	public String phoneNumber;

	public void depositFunds(double depositBalance) {
		System.out.println("Deposit of " + depositBalance + "made in " + accountNumber);
		balance = balance + depositBalance;
		System.out.println("New balance is " + balance);
	}

	public void withDrawFunds(double withDrawalBalance) {
		System.out.println("Withdrawal of " + withDrawalBalance + "made from " + accountNumber);
		balance = balance - withDrawalBalance;
		System.out.println("New balance is " + balance);
	}

}
