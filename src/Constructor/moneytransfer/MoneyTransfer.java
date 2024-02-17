package Constructor.moneytransfer;

//Write a program for MoneyTransfer
//MoneyTransfer has-a receiverAccountNumber, ReceiverPhone,ReceiverEmail,Amount
//Can construct MoneyTransfer
//By receiverAccountNumber and amount
//By receiverPhoen and amount
//By ReceiverEmail and amount

public class MoneyTransfer {
	long receiverAccountNumber;
	String receiverPhone,receiverEmail;
	double amount;
	public MoneyTransfer(long receiverAccountNumber,double amount) {
		this.receiverAccountNumber=receiverAccountNumber;
		this.amount=amount;
	}
	public MoneyTransfer(String receiverPhone, double amount) {
		this.receiverPhone=receiverPhone;
		this.amount=amount;
	}
	public MoneyTransfer(String receiverEmail, double amount, boolean isEmail) {
		this.receiverEmail=receiverEmail;
		this.amount=amount;
	}
	
}
