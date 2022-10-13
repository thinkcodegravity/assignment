/*
 * Project is created to perform the withdraw
 */
package method;

public class Bank {
	int balance=5000;
	int depositAmount=7000;
	int withdrawAmount=600;
	int depositLimit=6000;
	
	public void withdraw() {
		if(withdrawAmount<balance) {
		 
		int newBalance=balance-withdrawAmount;
		System.out.println("Your new balance after withdraw is $"+newBalance);
	}
		else {
			System.out.println("Insuffient balance");
		}
	}
	public void deposit() {
		if(depositAmount<depositLimit) {
			
		int newBalance=balance+depositAmount;
		System.out.println("Your new balance after deposit is $"+newBalance);
	}
		else {
			System.out.println("Please deposit on next transction or visit counter");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Bank of America ATM");
 Bank newBalance=new Bank();
 newBalance.withdraw();
 newBalance.deposit();
 }

}
