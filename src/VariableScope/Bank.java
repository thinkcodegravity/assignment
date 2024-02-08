package VariableScope;

public class Bank {
	double balance;
	
	//method for withdraw money
	public double Withdraw(int withdrawAmount) {
		balance-=withdrawAmount;
		return balance;
	}

}
