package methodDecRet;

public class Deposit {
	
	int balance;
	
	public int dpst (int depositAmt) {
		int newBalance = balance+depositAmt;
		
		return newBalance;
	}


}
