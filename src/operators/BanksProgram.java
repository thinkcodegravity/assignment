package operators;

public class BanksProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	has-a :Declare global variable bank money
	
	int bankMoney;
	
//	does-a :applyLoan method
	
	public String applyLoan(int loanAmount) {
		if(loanAmount<bankMoney) {
			return "Approved";
		}else {
			return "Denied";
		}
	}

}
