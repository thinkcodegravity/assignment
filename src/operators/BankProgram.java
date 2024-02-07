package operators;

import java.util.Scanner;


//Bank program 
//Has balance
//does withdraw functionality  - include inputs , return outputs and logic.
//does deposit functionality  - include inputs , return outputs and logic.

		
public class BankProgram {
	
	double balAmount =0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		BankProgram bp = new BankProgram();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Depost Amount:");
		amount = sc.nextDouble();
		System.out.println(bp.depositAmt(amount));
		
		System.out.print("Enter Withdraw Amount:");
		amount = sc.nextDouble();
		System.out.println(bp.withdrawAmt(amount));
	}
	
	public double withdrawAmt(double withdrawAmount) {
		
		if (balAmount>=withdrawAmount) {
			balAmount = balAmount - withdrawAmount;
		}else {
			System.out.println("insufficient Balance Amount");
		}
		return balAmount;
	}
	
	public double depositAmt(double depositAmount) {
		balAmount = balAmount + depositAmount;
		return balAmount;
	}
	

}
