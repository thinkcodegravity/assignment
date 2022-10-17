package constructor;
/*
 * Write a program for MoneyTransfer
MoneyTransfer has-a receiverAccountNumber, ReceiverPhone,ReceiverEmail,Amount
Can construct MoneyTransfer 
By receiverAccountNumber and amount
By receiverPhoen and amount
By ReceiverEmail and amount

 */

public class MoneyTransfer {
	String ReceiverAcNum;
	long phone;
	String ReceiverEm;
	double amt;
	 
	public MoneyTransfer( String acn, double a) {
		
		ReceiverAcNum=acn;
		amt=a;

	}
	public MoneyTransfer (long ph, double a) {
		amt=a;
		phone=ph;
		
	}
	public MoneyTransfer(String em, double a, long ph) {
		
		ReceiverEm= em;
		amt=a;
		phone=ph;
		
		
		
	}
	public static void main(String[]args) {
		MoneyTransfer mn1= new MoneyTransfer("123456789", 999.99);
		MoneyTransfer mn2= new MoneyTransfer(987654321, 999.99);
		MoneyTransfer mn3= new MoneyTransfer("ganga@mail", 999.99, 987645123);
		
	}
	

}
