package DataStructure;

public class BankAccount {
	// Declaring the global variables
	String customerName = "Samrat Khatiwada";
	String customerEmail = "abc@gmail.com";
	String accountNumber = "************213";
	double balance;

	// Creating method customerInformation to give information of customer.
	public void customerInformation() {
		System.out.println("Customer Name:" + customerName);
		System.out.println("Customer Email:" + customerEmail);
		System.out.println("Account Number:" + accountNumber);
	}
	//Creating a method to show initial bank balance of a customer
	public void setInitialBalance(double initialBalance) {
		balance = initialBalance;
		System.out.println("Your initial balance is: " + initialBalance);

	}

	// Creating a method for Deposit
	public void accountDeposit(int amount) {
		balance=balance+ amount;
		System.out.println("****************Deposit Transction******************");
		System.out.println("Total Amount Deposited: $" + amount);

		System.out.println("Total Account Balance After Deposit $" + balance);

	}

	// Creating a method for Deposit
	public void accountWithdraw(int amount) {
		balance = balance - amount;
		System.out.println("****************Withdraw Transction******************");
		System.out.println("Total Amount Withdrawn: $" + amount);

		System.out.println("Total Account Balance After Withdraw $" + balance);

	}
//Main method
	public static void main(String[] args) {
		System.out.println("*****Welcome To XYZ Bank*****");//Creating Greetings note for customer
		// Creating reference bank
		BankAccount bank = new BankAccount();
		/*
		 * method calling statement to show the customer information, starting balance, balance after
		 *  deposit and final balance after withdraw.
		 */
		bank.customerInformation();
		bank.setInitialBalance(5000);
		bank.accountDeposit(500);
		bank.accountWithdraw(1000);

		System.out.println("*************Have a Good Day*************");
	}

}
