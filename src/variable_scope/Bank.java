package variable_scope;

public class Bank {
	double balance;
	public String withdraw(double withdrawAmount) {
		return "Withdrawing " + withdrawAmount + "Balance: " + (balance - withdrawAmount);
	}
}
