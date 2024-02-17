package Constructor.payment;

//Write a program for Payment
//Payment has creditCardNumber,
//creditcardExpiry,creditCardSecCode,paypalUsserid,paypalPassword
//Can construct payment
//By creditCardNumber, creditcardExpiry,creditCardSecCode
//By paypalUsserid,paypalPassword

public class Payment {
	long creditCardNumber;
    String creditCardExpiry,paypalUserId,paypalPassword;
	short creditSecCode;
	public Payment(long creditCardNumber,String creditCardExpiry,short creditSecCode) {
		this.creditCardNumber=creditCardNumber;
		this.creditCardExpiry =creditCardExpiry;
		this.creditSecCode=creditSecCode;
	}
	public Payment(String paypalUserId,String paypalPassword) {
		this.paypalUserId=paypalUserId;
		this.paypalPassword=paypalPassword;
	}
}
