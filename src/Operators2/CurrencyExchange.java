package Operators2;

import java.util.Scanner;
/*
 * This Currency exchange program is designed to convert the User USD amount into Pound Sterling.
 */

public class CurrencyExchange {

	double UKpound;
	//Creating a method to convert from dollar to UK pound
	public double ExchangeCurrency(double dollar) {
		
		//1$=0.79 pound sterling
		double DollarEqvPound=0.79;
		
		//Converting $ into pound Sterling
		double ExchangeAmount=dollar*DollarEqvPound;
		
		System.out.println("$"+dollar+" = "+ExchangeAmount+" Pound Sterling");
		return ExchangeAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyExchange ex=new CurrencyExchange();
		// Scanner sc to take dollar as an input from the user
				Scanner sc = new Scanner(System.in);
				System.out.println("Please enter your amount in $:");
				double USD=sc.nextDouble();
				
				ex.ExchangeCurrency(USD);
				

	}

}
