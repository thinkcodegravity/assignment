package constructor;

import java.util.Date;

public class Payment {
	int creditCardNumber;
	Date creditcardExpiry;
	int creditCardSecCode;
	String paypalUserId, paypalPassword;
	
	public Payment(int creditCardNumber_, Date creditcardExpiry_, int creditCardSecCode_) {
		creditCardNumber = creditCardNumber_;
		creditcardExpiry = creditcardExpiry_;
		creditCardSecCode = creditCardSecCode_;
	}
	
	public Payment(String paypalUserId_, String paypalPassword_) {
		paypalUserId = paypalUserId_;
		paypalPassword = paypalPassword_;
	}
}
