package Constructor.payment;


public class Main {

	public static void main(String[] args) {
		Payment payment =new Payment(100012345678L,"02/30",(short)107);
		Payment paypal =new Payment("Ariana11","ariana12345");
		System.out.println("creditcard Number: "+payment.creditCardNumber+"\ncreditcard security number: "+payment.creditSecCode+"\ncredit expiry date: "+payment.creditCardExpiry);
		System.out.println("paypal userid: "+paypal.paypalUserId+"\npaypal password: "+paypal.paypalPassword);
	}

}