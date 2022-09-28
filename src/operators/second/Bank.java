package operators.second;

public class Bank {
	double bankMoney;
	
	public void applyLoan(int loanAmount) {
		if(loanAmount < bankMoney) {
			System.out.println("Loan approved");
		}else {
			System.out.println("Loan denied");
		}
	}

}
