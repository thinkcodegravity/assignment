package Method;

public class PaypalPayment {
//Declaring Variables of PayPal Account
	String AccountName = "Code Gravity LLC";
	String email = "abcd@gmail.com";

	// Creating a method PayPalPayment having double as a return type and double as
	// a input.
	public double PayPalPayment(double PaymentAmount) {

		System.out.println(AccountName + " accepted the amount of $" + PaymentAmount + " through PayPal.");
		return PaymentAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaypalPayment pay = new PaypalPayment();// Creating reference object pay
		pay.PayPalPayment(500.15);// method calling statement
	}

}
