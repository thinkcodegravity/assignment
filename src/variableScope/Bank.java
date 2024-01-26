package variableScope;

public class Bank {
	
	long accountNo;
	float balance;
	String fullName;
	
	public float withdrawAmount(float amount) {
		return balance - amount;
	}

}
