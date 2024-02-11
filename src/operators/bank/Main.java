package operators.bank;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float accountBalance = 10000.50f;//this value usually comes the data stored in database
		BankProgram bank =new BankProgram(accountBalance);
		Scanner object =new Scanner(System.in);
		System.out.println("Enter 1 to withdraw and 2 to deposit");
		byte a= object.nextByte();
		if(a==1) {
			float remainingBalance= bank.withdraw(accountBalance);
			System.out.println("the remaining balance is = "+remainingBalance);
		}else {
			float total =bank.deposit(accountBalance);
			System.out.println("the new total amount is ="+total);
		}
	}

}