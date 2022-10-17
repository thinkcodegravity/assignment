package constructor;
/*
 * Write a program for Payment
Payment has creditCardNumber, creditcardExpiry,creditCardSecCode,paypalUsserid,paypalPassword
Can construct payment
By creditCardNumber, creditcardExpiry,creditCardSecCode
By paypalUsserid,paypalPassword

 */

public class Payment {
	long creditNum;
	String creditExp;
	int creditSec;
	String paypalUserid;
	String paypalPwd;
	
	public Payment (long crn, String cre, int crs){
		creditNum=crn;
		creditExp= cre;
		creditSec= crs;
		
		
	}
	public Payment (String Uid, String ppwd) {
		paypalUserid= Uid;
		paypalPwd= ppwd;
	}
	
	public static void main(String[]args) {
		Payment p1= new Payment(1235467890, "11/24", 305);
		
		Payment p2= new Payment("gangalm", "java");
		
		
	}
	

}
