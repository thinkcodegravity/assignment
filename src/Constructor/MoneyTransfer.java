package Constructor;

public class MoneyTransfer {
public long recAccountNumber = 1313142423423L;
public int recPhone = 32423423;
public String recEmail = "a@a.com";
public float amount = 110;

public MoneyTransfer(long recAccNumber,float amt) {
	recAccountNumber=recAccNumber;
	amount=amt;
}
public MoneyTransfer(int recPhone,float amount) {
	this.amount= amount;
	this.recPhone = recPhone;
	
}
public MoneyTransfer(String recEmail,float amount) {
	this.amount= amount;
	this.recEmail = recEmail;
}
}

