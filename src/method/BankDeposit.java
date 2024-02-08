package method;

public class BankDeposit {
	
	//Create a method that can process deposit from bank account
	double totalBalance;
	double databaseUserAccountId;
	double dataBaseTransferNo;
	double total;
	public double Deposit(double totalBalance, double depositAmount, int userAccountId, int transferNo) {
		if(userAccountId==databaseUserAccountId && transferNo==dataBaseTransferNo){
			total= totalBalance+depositAmount;
			}
		return total;
		}
}
