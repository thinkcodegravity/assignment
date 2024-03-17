public class Bank {
	static double Balance = 16000;
	public static void withDraw(double wdamount) {
		Balance = Balance - wdamount;
		System.out.println( "Balance Amount is" +Balance);
		
	}
	public static void deposit(double dAmount) {
		Balance = Balance + dAmount;
		System.out.println("Total Balance amount is" +Balance);
	}
	public static void main(String args[]) {
		System.out.println("Initial Balance is" +Balance);
		withDraw(1200);
		deposit(1000);
		
	}
}