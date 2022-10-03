package operator.second;

public class Bank {
	int bankMoney;
	public void applyloan(int loanAmt) {
		if (bankMoney>loanAmt) {
			System.out.println("Loan Approved");
		}
		else {
			System.out.println("Loan Denied");
		}
	}

}
