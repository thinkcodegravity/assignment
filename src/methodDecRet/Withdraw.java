package methodDecRet;

public class Withdraw {
	
	int balance;
	
	public int wthdrw (int withdrawAmt) {
		int newBalance = balance-withdrawAmt;
		
		return newBalance;
	}

}
