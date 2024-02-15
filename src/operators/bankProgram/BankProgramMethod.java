package operators.bankProgram;

public class BankProgramMethod {
	
	long bankMoney = 99999999999999999l;
	
	public void applyLoan (long a) {
		
		if (a < bankMoney) {
			System.out.println("Loan Approved");
		}
		
		else {
			System.out.println("Loan Denied");
		}
	}
	

}
