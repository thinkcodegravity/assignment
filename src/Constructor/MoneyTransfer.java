package Constructor;

public class MoneyTransfer {
	String receiverAccountNumber;
	double amount;
	String receiverPhone;
	String receiverEmail;

	public MoneyTransfer(String receiverAccountNumber, double amount) {
		this.receiverAccountNumber = receiverAccountNumber;
		this.amount = amount;
	}

	/*
	 * public MoneyTransfer(String receiverPhone, double amount) {
	 * this.receiverPhone = receiverPhone; this.amount = amount; }
	 * 
	 * public MoneyTransfer(String receiverEmail, double amount) {
	 * this.receiverEmail = receiverEmail; this.amount = amount; }
	 */

}
