package constructors.payment;

public class PaymentConst {
	
	String creditCardNum;
	String creditCardExp;
	String creditCardSec;
	String payPalUserID;
	String payPalPW;
	
	public PaymentConst (String a, String b, String c) {
		creditCardNum = a;
		creditCardExp = b;
		creditCardSec = c;
		
		System.out.println(creditCardNum);
		System.out.println(creditCardExp);
		System.out.println(creditCardSec);
		
		
	}
	
	public PaymentConst (String a, String b) {
		payPalUserID = a;
		payPalPW = b;
		
		System.out.println(payPalUserID);
		System.out.println(payPalPW);

		
	}

}
