package Constructor.payment;


public class Main {

	public static void main(String[] args) {
		Payment payment =new Payment(100012345678L,"02/30",107);
		Payment paypal =new Payment("Ariana11","ariana12345");
		System.out.println(payment.creditCardNumber+"\n"+payment.creditSecCode+"\n"+payment.creditCardExpiry);
	}

}