package constructor;

/* Write a program for MoneyTransfer
MoneyTransfer has-a receiverAccountNumber, ReceiverPhone,ReceiverEmail,Amount
Can construct MoneyTransfer 
By receiverAccountNumber and amount
By receiverPhoen and amount
By ReceiverEmail and amount
 */


public class MoneyTransfer {
		
	int receiverAccountNumber;
	long receiverPhone;
	String receiverEmail;
	double amount;
	
	
	public MoneyTransfer (double amt) {
		amount = amt;
	}
	
	public MoneyTransfer ( int accnum , double amt) {
		
		this(amt);
		receiverAccountNumber = accnum;
	}
	
	public MoneyTransfer (long num , double amt) {
		
		this(amt);
		receiverPhone = num;
	}
	
	public MoneyTransfer (String email, double amt) {
		
		this(amt);
		receiverEmail = email;

	}
	
}
