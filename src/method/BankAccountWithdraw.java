package method;

public class BankAccountWithdraw {
	//Create a method that can process withdraw from bank account
	double totalBalance;
	public void withDrawal(double withdraw, double totalBalance) {
		if(totalBalance>=withdraw) {
			System.out.println("Withdrawn Succesfully");
		}else {
			System.out.print("Withdrawn Unsuccessfull,total balance is insufficient.");
		}
	}
}
