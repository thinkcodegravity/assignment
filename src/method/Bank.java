package method;

public class Bank {
	int balance=5000;
	int depositAmount=100;
	int withdrawAmount=600;
	
	public void withdraw() {
		 
		int newBalance=balance-withdrawAmount;
		System.out.println("Your new balance after withdraw is $"+newBalance);
	}
	public void deposit() {
		 
		int newBalance=balance+depositAmount;
		System.out.println("Your new balance after deposit is $"+newBalance);
	}

	public static void main(String[] args) {
		
 Bank newBalance=new Bank();
 newBalance.withdraw();
 newBalance.deposit();
 }

}
