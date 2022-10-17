package Constructors;

/*
	Write a program for Payment
	Payment has creditCardNumber, creditcardExpiry,creditCardSecCode,paypalUsserid,paypalPassword
	Can construct payment,
		1. By creditCardNumber, creditcardExpiry,creditCardSecCode
		2. By paypalUsserid,paypalPassword
*/

public class Payment {

	long creditCardNumber;
	String creditCardExpiry;
	int creditCardSecCode;
	String paypalUsserid;
	String paypalPassword;

	public static void main(String[] args) {
		Payment payment1 = new Payment(356975213, "10/2028", 420);
		Payment payment2 = new Payment("prabin123", "kunwar123");
	}

	public Payment(long creditCardNumber, String creditCardExpiry, int creditCardSecCode) {
		this.creditCardNumber = creditCardNumber;
		this.creditCardExpiry = creditCardExpiry;
		this.creditCardSecCode = creditCardSecCode;
	}

	public Payment(String paypalUsserid, String paypalPassword) {
		this.paypalUsserid = paypalUsserid;
		this.paypalPassword = paypalPassword;
	}
}
