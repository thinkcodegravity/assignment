package contructor;
/*
	Write a program for Payment
	Payment has creditCardNumber, creditcardExpiry,creditCardSecCode,paypalUsserid,paypalPassword
	Can construct payment
	By creditCardNumber, creditcardExpiry,creditCardSecCode
	By paypalUsserid,paypalPassword
	 */
public class Payment {
	
long cardNumber;
long expireDate;
int cardSecCode;
String paypaluserid;
String paypalPassword;

public Payment(long crd, long exp, int sc) {
	
	cardNumber=crd;
	expireDate = exp;
	cardSecCode=sc;
}

public Payment(String ppl, String plp) {
	paypaluserid=ppl;
	paypalPassword=plp;
	
	
}

}
