package operator;

public class Bank {	
	static double balance = 2000;
	
	public static void withDraw(double withDrawAmount) {
		balance = balance - withDrawAmount;
		System.out.println("Balance after withdraw is "+balance);
	}
	
	public static void deposit(double depositAmount) {
		balance = balance + depositAmount;
		System.out.println("Balance after deposit is "+balance);
	}
	public static void main(String[] args) {
		System.out.println("Intial Balance is "+ balance);
		withDraw(500);
		deposit(900);		
	}

}
	