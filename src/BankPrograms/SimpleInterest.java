package BankPrograms;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// Calculation of simple interest for loan
		//Simple interest formula is I =PTR/100
		//I=Interest Amount, P=Principle Amount, T=Time in Years, R = Interest Rate in Percentage
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the principle amount :-$ ");
	    double P = scanner.nextDouble();               //Principle amount
	    
	    System.out.println("Enter the time for loan :- ");
	    double T = scanner.nextDouble();                   //Loan time in years
	    
	    System.out.println("Enter the percentage rate :- ");
	    double R = scanner.nextDouble();                   //Interest rate in percentage
	    
	    double SimpleInterest = P*T*R/100;
		
	    System.out.println("The interest amount is "+  SimpleInterest + " in " + T + "years with " + R + "% of priciple of amount " + P +"." );
	    
	}

}
