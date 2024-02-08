package constructor;

//Write a program for Payment
//Payment has creditCardNumber, creditcardExpiry,creditCardSecCode,paypalUsserid,paypalPassword
//Can construct payment
//By creditCardNumber, creditcardExpiry,creditCardSecCode
//By paypalUsserid,paypalPassword

public class Payment {
	
long creditCardNumber;
String creditcardExpiry;
int creditCardSecCode;
String paypalUsserid;
String paypalPassword;

public Payment(long cn,String exp,int sec) {
	creditCardNumber=cn;
	creditcardExpiry=exp;
	creditCardSecCode=sec;
	
}

public Payment(String pId,String pPass) {
	paypalUsserid=pId;
	paypalPassword=pPass;
}
}
