package Constructor;

import java.util.Scanner;

public class MoneyTransfer {

	// Declaring Variables of class MoneyTransfer
	long receiverAccountNumber;
	long ReceiverPhone;
	String ReceiverEmail;
	double Amount;

	// 1.Creating a constructor with account number and amount as an input
	public MoneyTransfer(long accountNumber, double amount) {
		receiverAccountNumber = accountNumber;
		Amount = amount;
		System.out.println("$"+Amount+" transferred to receiver account successfully!");
	}

	// 2.Creating a constructor with phone and amount as an input
	public MoneyTransfer(double amount, long phone) {
		ReceiverPhone = phone;
		Amount = amount;
		System.out.println("$"+Amount+" transferred to receiver account successfully!");
	}

	// 3.Creating a constructor with email and amount as an input
	public MoneyTransfer(String emailAddress, double amount) {
		ReceiverEmail = emailAddress;
		Amount = amount;
		System.out.println("$"+Amount+" transferred to receiver account successfully!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to westren union money Service");
		System.out.println("Method 1 : Using Receiver Account Number");
		System.out.println("Method 2 : Using Receiver Phone Number");
		System.out.println("Method 3 : UsingReceiver  Email");
		// Using Scanner to take input from the user side
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Choose one of the method to senf money:");
		int method = sc.nextInt();
		// if else statements for method:

		if (method == 1) {
			System.out.println("Please enter Receiver Account number:");
			Long accNo = sc.nextLong();
			sc.nextLine();

			System.out.println("Please enter your amount: ");
			double sendingAmount = sc.nextDouble();

			// Constructor calling statement
			MoneyTransfer send1 = new MoneyTransfer(accNo, sendingAmount);
			
		} else if (method == 2) {
			System.out.println("Please Receiver phone number:");
			Long phoneNo = sc.nextLong();
			sc.nextLine();

			System.out.println("Please enter your amount: ");
			double sendingAmount = sc.nextDouble();
			
			// Constructor calling statement
			MoneyTransfer send2 = new MoneyTransfer(sendingAmount, phoneNo);
			
		} else if (method == 3) {
			System.out.println("Please Receiver Email:");
			String email = sc.nextLine();
			sc.nextLine();

			System.out.println("Please enter your amount: ");
			double sendingAmount = sc.nextDouble();
			
			// Constructor calling statement
			MoneyTransfer send3 = new MoneyTransfer(email, sendingAmount);
			
		} else {
			System.out.println("Invalid Method Choice");
		}

	}

}
