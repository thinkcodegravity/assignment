package Assignment3_DeclareReturnStatements;
import java.util.Scanner;

public class PaymentProcessor {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

		  // Input user payment details
		  System.out.print("Enter payment amount: ");
		  double amount = scanner.nextDouble();
		  System.out.print("Enter card number: ");
		  String cardNumber = scanner.nextLine();
		  scanner.nextLine();
		  System.out.print("Enter expiration date (MM/YY): ");
		  String expirationDate = scanner.nextLine();
		  System.out.print("Enter security code: ");
		  int securityCode = scanner.nextInt();

		  // process the payment
		  boolean paymentSuccessful = processPayment(amount, cardNumber, expirationDate, securityCode);

		  // print the payment response
		  if (paymentSuccessful) {
		    System.out.println("Payment successful!");
		  } else {
		    System.out.println("Payment failed. Please check the details and try again.");
		  }
		}
	
	
	  // method to process a payment
	  public static boolean processPayment(double amount, String cardNumber, String expirationDate, int securityCode) {
	    // check if the amount is greater than zero
	    if (amount <= 0) {
	      System.out.println("Invalid amount: " + amount);
	      return false;
	    }

	    // check if the card number is valid
	    if (!isValidCardNumber(cardNumber)) {
	      System.out.println("Invalid card number: " + cardNumber);
	      return false;
	    }

	    // check if the expiration date is in the future
	    if (!isValidExpirationDate(expirationDate)) {
	      System.out.println("Invalid expiration date: " + expirationDate);
	      return false;
	    }

	    // check if the security code is correct
	    if (!isValidSecurityCode(securityCode)) {
	      System.out.println("Invalid security code: " + securityCode);
	      return false;
	    }

	    // if all checks pass, return true to indicate successful payment
	    return true;
	  }

	  // method to validate the card number
	  private static boolean isValidCardNumber(String cardNumber) {
	    // placeholder implementation: assume all card numbers are valid
	    return true;
	  }

	  // method to validate the expiration date
	  private static boolean isValidExpirationDate(String expirationDate) {
	    // placeholder implementation: assume all expiration dates are valid
	    return true;
	  }

	 
	  // method to validate the security code
	  private static boolean isValidSecurityCode(int securityCode) {
	    // placeholder implementation: assume all security codes are valid
	    return true;
	  }


}







