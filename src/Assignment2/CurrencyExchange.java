/*
 * This program is converting the value of dollars into the Rs.
 */
package Assignment2;
import java.util.Scanner;
public class CurrencyExchange {
	int dollar;
	double exchangeRupee;
	
	public void exchangeValue(int dollar) {
		//Calculating the exchange value
		 exchangeRupee=dollar*109.5;

		System.out.println("The exchange amount of $"+dollar+ " to rupee is Rs "+exchangeRupee);
		}
	public static void main(String[] args) {
		
		//Creating object Scanner to read the input from the user
		Scanner console=new Scanner(System.in);
		
		System.out.print("Please enter your dollor amount: $");
		int dollar=console.nextInt();
		CurrencyExchange exchange=new CurrencyExchange();
		exchange.exchangeValue(dollar);
		
	
		}

}
