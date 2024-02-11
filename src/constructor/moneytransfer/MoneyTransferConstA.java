package constructor.moneytransfer;

public class MoneyTransferConstA {
	
	long phoneNum;	
	int amount;
	
	public MoneyTransferConstA (long a, int b) {
		phoneNum = a;
		amount = b;
		
		System.out.println(phoneNum);
		System.out.println(amount);
	}

}
