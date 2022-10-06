package BankPrograms;

import java.text.DecimalFormat;//**********************************************set for Decimal format***********************************
import java.util.Scanner;      //***********************************************Scanner for user input**********************************

public class WithdrawAmount {

	public static void main(String[] args) {
		double CurrentBalance = 1748.27;                                    //Total defult balance amount
        

//---------------------------------------------------------------------------------------------------------------------------------------	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your ATM pin : - ");
		int ATMPin = scanner.nextInt();
		//****************************Firs if/else condition for ATM Pin Number**********************************************************
		if (ATMPin == 1011) {
			System.out.println("Welcome to Bank of America !!!");
			System.out.println("Kamal B. Saru");
			System.out.println("4307 Four Mill Road Baltimore MD 21236");
			System.out.println("Phone Number: 443-449-0534");
			System.out.println("Email Address :- rana.kamal54@yahoo.com");
			System.out.println("Your current balance is :-$"+ CurrentBalance);
			
		}
		else { 
			
			System.out.println("Invalid ATM Pin Number!!!");
			System.out.println("Please, Enter your correct ATM pin Number!!!");
			System.exit(0);                                                    //if enter invalid pin number not allowed to go withdraw steps
		}
	
		
		//********************************Second if/else condition for Withdraw Amount*****************************************************
		System.out.println("Please, enter your withdraw amount :-$  ");
		double WithdrawAmount = scanner.nextDouble();
		
		if (CurrentBalance > WithdrawAmount) {
			double RemainingBalance= CurrentBalance - WithdrawAmount;
			System.out.println("Your withdraw amount is :-$"+ WithdrawAmount);
			System.out.println("Your Remaining total balance in your account is:-$" +RemainingBalance);
			DecimalFormat df = new DecimalFormat();
			df.setMaximumFractionDigits(2);
		}
		else
		{
			
			System.out.println("Sorry, you have insufficient blance.!!!");
			System.exit(0);
		}
		
//-------------------------------------------------------------------------------------------------------------------------------------------
	}

}
