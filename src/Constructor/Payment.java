package Constructor;

public class Payment {
	String creditCardNumber;
	String creditcardExpiry;
	int CreditcardSecCode;
	String paypalUserid;
	String paypalPassword;

	public Payment(String creditCardNumber, String creditcardExpiry, int CreditcardSecCode) {
		this.creditcardExpiry = creditcardExpiry;
		this.creditCardNumber = creditCardNumber;
		this.CreditcardSecCode = CreditcardSecCode;
	}

	public Payment(String paypalUserid, String paypalPassword) {
		this.paypalPassword = paypalPassword;
		this.paypalUserid = paypalUserid;
	}

}
