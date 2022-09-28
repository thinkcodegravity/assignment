 package oops;

public class Bank {
public static void main (String[] args) {
	//Declaring variables
	String bankName="Bank of America";
	String firstName="Samrat";
	String lastName="Khatiwada";
	int accountNumber=143568970;
	double balance=5000.98;
	
	System.out.println("Welcome to the "+bankName);
	System.out.println("Customer Name: "+firstName+" "+lastName);
	System.out.println("Account Number: "+accountNumber);
	System.out.println("Available Balance: $"+balance);
	
}
	//Customer can withdraw money using withdraw method
	public void withdraw(int amountWithdraw, double balance) {
		balance=balance-amountWithdraw;
	}
	//Customer can deposit money using 
	public void deposit(int amountdeposite, double balance) {
		balance=balance+amountdeposite;
	}
	
}
