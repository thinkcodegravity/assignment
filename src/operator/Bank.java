package operator;

public class Bank {
	int balance;
	
	public int withdraw(int amount) {

		{
		if (balance>amount);
		System.out.println("Collect your money");
		}
		else{
		
			System.out.println("Insufficient Balance");
		}
		
		
		return amount;
		
	}
	public int deposit(int amt) {
		int totalBalance= balance+amt;
		return totalBalance;
		
		
	}

}
