package constructorAssignment;
/*
 	-Write a program for Payment
		Payment has creditCardNumber, creditcardExpiry,creditCardSecCode,paypalUsserid,paypalPassword
	-Can construct payment
		By creditCardNumber, creditcardExpiry,creditCardSecCode
		By paypalUsserid,paypalPassword

 */
public class Payment {
	String creditCardNumber;
	String creditCardExpiry;
	int creditCardSecCode;
	String paypalUsserid;
	String paypalPassword;
	
	public Payment(String creditCardNumber, String creditCardExpiry, int creditCardSecCode) {
		this.creditCardNumber=creditCardNumber;
		this.creditCardExpiry=creditCardExpiry;
		this.creditCardSecCode=creditCardSecCode;
	}
	
	public Payment(String paypalUsserid, String paypalPassword) {
		this.paypalUsserid=paypalUsserid;
		this.paypalPassword=paypalPassword;
		
	}

	public static void main(String[] args) {
		Payment p = new Payment("6543212345", "26/2026", 342);
		Payment pp = new Payment("shivaraj321", "dynamic");

	}

}
