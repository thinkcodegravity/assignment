package Constructors;

/*
	Write a program for MoneyTransfer
	MoneyTransfer has-a receiverAccountNumber, ReceiverPhone,ReceiverEmail,Amount
	Can construct MoneyTransfer, 
		1. By receiverAccountNumber and amount
		2. By receiverPhoen and amount
		3. By ReceiverEmail and amount
*/

public class MoneyTransfer {
	String receiverAccountNumber;
	long receiverPhone;
	String receiverEmail;
	double amount;

	public static void main(String[] args) {
		MoneyTransfer moneyTransfer1 = new MoneyTransfer("686425123458", 109876.23);
		MoneyTransfer moneyTransfer2 = new MoneyTransfer(682456789, 1600.50);
		MoneyTransfer moneyTransfer3 = new MoneyTransfer("865415324785", 789456321, 300.50);
	}

	public MoneyTransfer(String receiverAccountNumber, double amount) {
		this.receiverAccountNumber = receiverAccountNumber;
		this.amount = amount;
	}

	public MoneyTransfer(long receiverPhone, double amount) {
		this.receiverPhone = receiverPhone;
		this.amount = amount;
	}

	public MoneyTransfer(String receiverAccountNumber, long receiverPhone, double amount) {
		this.receiverAccountNumber = receiverAccountNumber;
		this.receiverPhone = receiverPhone;
		this.amount = amount;
	}

}
