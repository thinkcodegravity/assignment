package bank;

public class AccountDetails {
	
	long accountNumber;
	AccountType accountType;
	double interestRate;
	float bankBalance;
	CardDetails cardDetails;
//	long customerId;
	
	public AccountDetails(
			long accountNumber, 
			AccountType accountType, 
			double interestRate, 
			float bankBalance,
			CardDetails cardDetails
//			long customerId
		) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.interestRate = interestRate;
		this.bankBalance = bankBalance;
		this.cardDetails = cardDetails;
//		this.customerId = customerId;
	}
	
	

	public long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}



	public AccountType getAccountType() {
		return accountType;
	}



	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}



	public double getInterestRate() {
		return interestRate;
	}



	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}



	public float getBankBalance() {
		return bankBalance;
	}



	public void setBankBalance(float bankBalance) {
		this.bankBalance = bankBalance;
	}



	public CardDetails getCardDetails() {
		return cardDetails;
	}



	public void setCardDetails(CardDetails cardDetails) {
		this.cardDetails = cardDetails;
	}



	@Override
	public String toString() {
		return "AccountDetails [accountNumber=" + accountNumber + ", accountType=" + accountType + ", interestRate="
				+ interestRate + ", bankBalance=" + bankBalance + ", cardDetails=" + cardDetails + "]";
	}
	
}

enum AccountType {
	SAVING,
	CHECKING,
	CURRENT
}