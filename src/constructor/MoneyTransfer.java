package constructor;

public class MoneyTransfer {
	
	long receiverAccountNumber;
	int receiverPhone;
	String receiverEmail;
	double amount;
	
	public MoneyTransfer(long receiverAccountNumber,double amount) {
		this.receiverAccountNumber = receiverAccountNumber;
		this.amount = amount;
	}
	
	public MoneyTransfer(int receiverPhone,double amount) {
		this.receiverPhone = receiverPhone;
		this.amount = amount;
	}
	
	public MoneyTransfer(String receiverEmail,double amount) {
		this.receiverEmail = receiverEmail;
		this.amount = amount;
	}
}
