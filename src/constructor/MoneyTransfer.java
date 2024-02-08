package constructor;

//Write a program for MoneyTransfer
//MoneyTransfer has-a receiverAccountNumber, ReceiverPhone,ReceiverEmail,Amount
//Can construct MoneyTransfer 
//By receiverAccountNumber and amount
//By receiverPhoen and amount
//By ReceiverEmail and amount

public class MoneyTransfer {
	String receiverAccountNumber;
	String ReceiverPhone;
	String ReceiverEmail;
	int amount;
	
	public MoneyTransfer(String Ac,int a) {
		receiverAccountNumber=Ac;
		amount=a;
	}
	public MoneyTransfer(String Rp,int a) {
		ReceiverPhone=Rp;
		amount=a;
	}
public MoneyTransfer(String e,int a) {
	ReceiverEmail=e;
	amount=a;
}
}
