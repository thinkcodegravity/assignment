package constructor;

public class MoneyTransfer {
	long receiverAccountNumber;
	int receiverPhone;
	String receiverEmail;
	double amount;
	
	public MoneyTransfer(long receiverAccountNumber_, double amount_) {
		receiverAccountNumber = receiverAccountNumber_;
		amount = amount_;
	}
	
	public MoneyTransfer(int receiverPhone_, double amount_) {
		receiverPhone = receiverPhone_;
		amount = amount_;
	}
	
	public MoneyTransfer(String receiverEmail_, double amount_) {
		receiverEmail = receiverEmail_;
		amount = amount_;
	}
}
