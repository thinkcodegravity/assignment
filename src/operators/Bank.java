package operators;

public class Bank {
	double balance;
	public String depositMoney(double balance, double depositAmount) {
		balance = balance + depositAmount;
		return "Current Balance: " + balance;
	}
	public String withdrawMoney(double withdrawAmount) {
		balance = balance - withdrawAmount;
		return "Current Balance: " + balance;
	}
}
