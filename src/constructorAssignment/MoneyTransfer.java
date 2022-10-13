package constructorAssignment;
/*
 	Write a program for MoneyTransfer
		MoneyTransfer has-a receiverAccountNumber, ReceiverPhone,ReceiverEmail,Amount
	Can construct MoneyTransfer 
		By receiverAccountNumber and amount
		By receiverPhoen and amount
		By ReceiverEmail and amount

 */
public class MoneyTransfer {
	private String receiverAccountNumber;
	private long receiverPhone;
	private String receiverEmail;
	private double amount;
	
	public MoneyTransfer(String receiverAccountNumber, double amount) {
		this.receiverAccountNumber=receiverAccountNumber;
		this.amount=amount;
	}
	
	public MoneyTransfer(long receiverPhone, double amount) {
		this.receiverPhone=receiverPhone;
		this.amount=amount;
	}
	
	public MoneyTransfer(String receiverAccountNumber, long receiverPhone, double amount) {
		this.receiverAccountNumber=receiverAccountNumber;
		this.receiverPhone=receiverPhone;
		this.amount=amount;
	}
	public static void main(String[] args) {
		MoneyTransfer mt1 = new MoneyTransfer("5432123456543", 109876.23);
		MoneyTransfer mt2 = new MoneyTransfer(987654321l, 1000.50);
		MoneyTransfer mt3 = new MoneyTransfer("10002003456", 123123321l, 5000.50);

	}

}
