package BankPrograms;

import java.util.Scanner;

public class DepsitAmount {
	
	//Deposit Amount on your valid account number
	//Please enter your valid number, otherwise not allowed.

	public static void main(String[] args) {
		double BalanceAmount = 6513.78;                                          //Already total balance in account
		
		//Account informations and balance amount
		Scanner scanner = new Scanner(System.in);                                //User input for the existing account
		                                                                         //User input account number
		System.out.println("Please, Enter your account number :- ");
		int AccountNumber = scanner.nextInt();
		
		
		//*******************************************************************************************************************************************************
		//If/Else conditions for the correct informations
		//If ealse close in 
		if(AccountNumber == 123456) {                                            //True or enter exact account number and you will get customer full informations.
			System.out.println("Welcome to Bank of America !!!");
			System.out.println("Kamal B. Saru");
			System.out.println("4307 Four Mill Road Baltimore MD 21236");
			System.out.println("Phone Number: 443-449-0534");
			System.out.println("Date of Birth : July/23/1989");
			System.out.println("Your current balance is :-$"+ BalanceAmount);
			
			System.out.println("Please, Enter your deposit Amount :-$ ");
			double deposit =scanner.nextDouble();
			double TotalBalance = BalanceAmount + deposit;
			System.out.println("Total Balance in your Account is :-$" + TotalBalance);
			System.out.println("Thank You !! Have a Good Day!!!");
		}
		
		//Wrong account cann't go in
		else {
			
			System.out.println("Invalid Acount Number!!!");
			System.out.println("Please, Enter correct Account Number!!!");
		}
			
		scanner.close();
		
	}

}
