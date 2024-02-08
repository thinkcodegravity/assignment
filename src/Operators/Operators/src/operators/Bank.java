package operators;

public class Bank {
	static double Balance = 10000;
	public static void withDraw(double withdrawamount) {
		Balance = Balance - withdrawamount;
		System.out.println("Balance Amount is" +Balance);
		
	}
	public static void deposit(double depositAmount) {
		Balance = Balance + depositAmount;
		System.out.println("Total Balance amount is" +Balance);
	}
	public static void main(String args[]) {
		System.out.println("Initial Balance is" +Balance);
		withDraw(3000);
		deposit(1000);
		
	}
}
