package BankProgramOperator;

public class Withdraw {

	public int withdraw (int withdrawAmount, int balance) {
		if (withdrawAmount > balance) {
			
			System.out.println("Insufficient balance");
			
		}
		
		else {
			 
			System.out.println("Thank You");
		}
		return 0;
	}
}
