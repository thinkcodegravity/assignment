package BankProgramOperator;

public class Withdraw {

	public int withdraw (int withdrawAmount, int balance) {
		if (withdrawAmount > balance) {
			
			System.out.println("Insufficient balance");
			
		}
		
		else {			
			int remainingBalance = balance - withdrawAmount;
			System.out.println("Thank You, Your remaining balance is = " +remainingBalance );

		}
		return 0;
	}
}
