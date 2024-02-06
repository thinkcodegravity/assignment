package constructors;

public class MoneyTransfer {
	
	String receiverAccNo;
	String phoneNumber;
	String receiverEmail;
	int amount;
	
	public MoneyTransfer(String receiverAccNo, String phoneNumber, String receiverEmail, int amount) {
		if (receiverAccNo != null) {
			this.receiverAccNo = receiverAccNo;
		} else if (phoneNumber != null) {
			this.phoneNumber = phoneNumber;
		} else if (receiverEmail != null) {
			this.receiverEmail = receiverEmail;			
		}
		this.amount = amount;
	}

	

}
