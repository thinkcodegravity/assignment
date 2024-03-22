package operators;

public class BankLoan {
	static double bankMoney;
	public String applyLoan(double loanAmount) {
		if (loanAmount < bankMoney) {
			return "Loan Approved";
		}
		else {
			return "Loan Denied";
		}
	}
}
