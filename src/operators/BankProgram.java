package operators;

public class BankProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	int bankBalance;
	
	public boolean withdrawFromAccount(int amountToWithdraw) {
		
		if(bankBalance>0 && bankBalance>amountToWithdraw) {
			return true;
		}else {
			return false;
		}
	}
	
	public int depositIntoAccount(int amountToDeposit) {
		if(amountToDeposit>0) {
			int newBalance=bankBalance+amountToDeposit;
			return newBalance;
		
		}else {
			return bankBalance;
		}
	}

}
