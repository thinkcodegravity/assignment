package operators;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		int balance = 50;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Choose 1 to Withdraw, 2 to Deposit");
		int choice = sc.nextInt();
		
		
		
		if (choice == 1) {
			System.out.println("How much would you like to withdraw?");
			int withdraw = sc.nextInt();
			int newBalance = balance - withdraw;
			System.out.println("Your new balance is: "+newBalance);
		}
		
		else if (choice == 2) {
			System.out.println("How much would you like to deposit?");
			int deposit = sc.nextInt();
			int newBalance = balance + deposit;
			System.out.println("Your new balance is: "+newBalance);
		}
		
		else {
			System.out.println("Invalid input");
		}
		}

	}

