package Constructor;

import java.util.Scanner;

public class Payment {
	// Declaring the variables of class Payment
	long creditCardNumber;
	String creditcardExpiry;
	int creditCardSecCode;
	String paypalUsserid;
	String paypalPassword;

	// Creating constructor of program payment having long string and integer variable input
	public Payment(long cardNumber, String expiryDate, int cvv) {
		creditCardNumber=cardNumber;
		creditcardExpiry=expiryDate;
		creditCardSecCode=cvv;
		System.out.println(" Credit Card Payment Successful!");
	}

	// Creating constructor of program payment having two string variable input
	public Payment(String userId, String Password) {
		paypalUsserid=userId;
		paypalPassword=Password;
		System.out.println(" Paypal Payment Successful!");
	}

	public static void main(String[] args) {

		System.out.println("Payment Method");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Choose 1 for credit card payment or 2 for Paypal Payment");
		int option = sc.nextInt();

		// if else statements for options:
		if (option == 1) {
			
			System.out.println("Please enter your card number:");
			Long cardNo = sc.nextLong();
			sc.nextLine();

			System.out.println("Please enter card Expiry date:");
			String cardExpiryDate = sc.nextLine();

			System.out.println("Please enter 3 digit number:");
			int cardCvv = sc.nextInt();
			sc.nextLine();

			// Constructor calling with Long cardNo, String cardExpiryDate and int cardCvv
			;
			Payment pay1 = new Payment(cardNo, cardExpiryDate, cardCvv);

		} else if (option == 2) {
			System.out.println("Please enter your paypal User name:");
			String userId = sc.nextLine();
			sc.nextLine();

			System.out.println("Please enter your Paypal account password:");
			String accountPassword = sc.nextLine();
			// Constructor calling with String userId and String account Password

			Payment pay2 = new Payment(userId, accountPassword);
		} else {
			System.out.println();
		}

	}

}
