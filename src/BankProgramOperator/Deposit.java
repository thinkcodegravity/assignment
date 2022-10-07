package BankProgramOperator;

public class Deposit {
	public int deposit (int depositAmount, int balance) {
		
		int newBalance =  depositAmount + balance;
		System.out.println("New balance = " + newBalance);

			return newBalance;
		}
	

}
