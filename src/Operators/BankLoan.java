package Operators;

public class BankLoan {

	double bankMoney;

	public void applyLoan(int loanAmount) {
		if (loanAmount < bankMoney) {
			System.out.println("Loan approved.");
		} else {
			System.out.println("Loan denied. Please enter different amount.");
		}
	}
}
