/*
 * Project is created to perform the withdraw and Deposit using Bank ATM.
 * Also Calculate the simple interest
 */
package method;

public class Bank {
	int balance=5000;
	int depositAmount=7000;
	int withdrawAmount=600;
	int depositLimit=6000;
	int year=5;
	double rate=5.5;
	
	public void simpleInterest( ) {
		double interestAmount=(balance*year*rate)/100;
		System.out.println("Your total interest of $"+ balance+" in "+year+" year "+" will be: $"+interestAmount);
	}
	
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
		//Method calling for the operations
 Bank amt=new Bank();
 amt.withdraw();
 amt.deposit();
 Bank interest=new Bank();
 interest.simpleInterest();
 
 }

}
