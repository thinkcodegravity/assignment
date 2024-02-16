package method;

public class BankDeposit {
	double balance;
	public double depositAmount(int depositAmount) {
		balance = balance + depositAmount;
		return balance;
		
	}

}
