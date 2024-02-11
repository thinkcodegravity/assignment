package constructor.moneytransfer;

public class MoneyTransferConst {
	
	long accountNum;
	String email;
	int amount;
	
	public MoneyTransferConst (long a, int b) {
		accountNum = a;
		amount = b;
		
		System.out.println(accountNum);
		System.out.println(amount);
		
		
	}
		
	public MoneyTransferConst (String a, int b) {
		email = a;
		amount = b;
		
		System.out.println(email);
		System.out.println(amount);
		
	}

}
