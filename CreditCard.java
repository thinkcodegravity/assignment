package Assignment3_Variables;

import java.util.Scanner;

public class CreditCard {
  // instance variables
  private String cardHolderName;
  private String cardNumber;
  private String expirationDate;
  private int securityCode;

  
  // constructor
  public CreditCard(String cardHolderName, String cardNumber, String expirationDate, int securityCode) {
    this.cardHolderName = cardHolderName;
    this.cardNumber = cardNumber;
    this.expirationDate = expirationDate;
    this.securityCode = securityCode;
  }

    
  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    // prompt the user to enter the credit card details
	    System.out.print("Enter card holder name: ");
	    String cardHolderName = input.nextLine();
	    System.out.print("Enter card number: ");
	    String cardNumber = input.nextLine();
	    System.out.print("Enter expiration date (MM/YY): ");
	    String expirationDate = input.nextLine();
	    System.out.print("Enter security code: ");
	    int securityCode = input.nextInt();

	    // create a CreditCard object with the given details
	    CreditCard cc1 = new CreditCard(cardHolderName, cardNumber, expirationDate, securityCode);

	    // use the getter methods to print the values of the instance variables
	    System.out.println("Card Holder Name: " + cc1.getCardHolderName());
	    System.out.println("Card Number: " + cc1.getCardNumber());
	    System.out.println("Expiration Date: " + cc1.getExpirationDate());
	    System.out.println("Security Code: " + cc1.getSecurityCode());
	  }
  
  // getters and setters for the instance variables
  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }

  public int getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(int securityCode) {
    this.securityCode = securityCode;
  }

}
