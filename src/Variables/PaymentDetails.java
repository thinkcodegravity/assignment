package Variables;

public class PaymentDetails {
	
	String paymentType;//Payment type can be debit, credit, paypal, crypto and so on.
	{
		paymentType="Crypto Payment";//initializing the values for payment type
	}
	
	//Declaring the variables for payment type of Dabit/Credit cards.
	String customerName;
	String cardNumber;
	int cVV;
	String expDate;
	{
		//initializing the variables for payment type of Dabit/Credit cards.
		customerName="Samrat Khatiwada";
		cardNumber="12345678911235690";
		cVV=123;
		expDate="07/25";
	}
	
	//Declaring the variables for paypal payment type.
	String email;
	{
		//initializing the variables for payment type of Papal
		email="abcde@gmail.com";
	}
	
	//Declaring the variables for Crypto payment type.
	String cryptoWalletAddress;
	
	{
		//initializing the variables for payment type of Crypto Payment.
		cryptoWalletAddress="1de4gdu6dfj57ehdii478y";
	}
	
	
	
	
	

}
