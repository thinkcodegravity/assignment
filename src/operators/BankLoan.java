package operators;

import java.util.Scanner;

/*
Create bank program
(has-a)Declare global variable bank money
Create applyLoan method takes loan amount input. 
If customer requestsing loan amount is less than bank available money then print loan approved or denied.
*/
public class BankLoan {

static double bankMoney = 1000; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter the loan amount: ");
			double loanAmt = sc.nextDouble();   
			applyLoan(loanAmt);
		}
	}
	
	public static void applyLoan(double amount) {
		if(bankMoney > amount ) {
			System.out.println("Approved");
		}else {
			System.out.println("Denied");
		}
	}

}
