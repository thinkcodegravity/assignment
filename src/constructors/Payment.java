package constructors;

public class Payment {
	
	String creditCardNumber;
	String creditCardExpiry;
	int secCode;
	String payPalUserId;
	String payPalPassword;
	
	public Payment(String creditCardNumber, String creditCardExpiry, int secCode) {
		this.creditCardNumber = creditCardNumber;
		this.creditCardExpiry = creditCardExpiry;
		this.secCode = secCode;
	}
	
	public Payment(String payPalUserId, String payPalPassword) {
		this.payPalUserId = payPalUserId;
		this.payPalPassword = payPalPassword;
	}
	
	

}
