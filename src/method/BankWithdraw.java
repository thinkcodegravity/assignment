package method;

public class BankWithdraw {	
	double balance;
	public double withdraw(int withDrawAmount) {
		balance = balance - withDrawAmount;
		return balance;
	}

}
