package Variables;

import java.util.Date;

public class PaymentDetails {
	String paymentType;
	double amount;
	Date transactionDate;
	CreditCardDetails cardDetails;
	
	public PaymentDetails(String paymentType, double amount, Date transactionDate, CreditCardDetails cardDetails) {
		super();
		this.paymentType = paymentType;
		this.amount = amount;
		this.transactionDate = transactionDate;
		this.cardDetails = cardDetails;
	}
	
}
