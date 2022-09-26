package operators;

public class Bank {
	int balance;
	
	public int withdraw(int withdrawAmount) {
		if(balance>withdrawAmount) {
			System.out.println("withdraw successful");
		}else {
			System.out.println("Insufficient balance");
		}
		return withdrawAmount;
		
		
	}
	
	public int deposit(int depositAmount) {
		int totalBalance = balance + depositAmount;
		return totalBalance;
	}

}
