package constructor;

public class Payment {

	long creditCardNumber;
	short creditcardExpiry;
	byte creditCardSecCode;
	String paypalUsserid;
	String paypalPassword;
	
	public Payment(String paypalUsserid,String paypalPassword) {
		this.paypalUsserid = paypalUsserid;
		this.paypalPassword = paypalPassword;
		
	}
	
	public Payment(long creditCardNumber,short creditcardExpiry,byte creditCardSecCode) {
		this.creditCardNumber = creditCardNumber;
		this.creditcardExpiry = creditcardExpiry;
		this.creditCardSecCode = creditCardSecCode;
	}
}
