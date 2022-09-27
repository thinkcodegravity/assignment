
public class Bank {

	public static void main(String[] args) {	
		String CustomerName = "Kamal Saru";
		int BankAccount = 12345;
		int ATMpin = 1101;
	    String UserID = "Codegravity";
	    String Password = "Code";
	    Double Balance = 1452.78;
	    Double Deposit = 102.65;
	    Double Withdraw = 152.34;
	    Double Transfer = 182.45;
	    Double TotalAmount = Balance + Deposit - Withdraw -Transfer;
	    
	    System.out.println("Customer Name :- "+ CustomerName);
	    System.out.println("Total Amount in the Bank :-$"+TotalAmount);

	}

}
