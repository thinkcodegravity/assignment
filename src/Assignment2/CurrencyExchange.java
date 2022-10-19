/*
 * This program is converting the value of dollars into the rupee
 */
package Assignment2;
import java.util.Scanner;
public class CurrencyExchange {

	public static void main(String[] args) {
		int dollar;
		double exchangeRupee;
		//Creating object Scanner to read the input from the user
		Scanner console=new Scanner(System.in);
		
		System.out.println("Please enter your dollor amount: ");
		dollar=console.nextInt();
		//Calculating the exchange value
		exchangeRupee=dollar*109.5;
		
		System.out.println("The exchange amount of $"+dollar+ " to rupee is Rs "+exchangeRupee);
		}

}
