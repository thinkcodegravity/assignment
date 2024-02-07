package operators;

import java.util.Scanner;

/*
Create currency program
Take dollar as input and return the UK pound equivalent
*/
public class Currency {

static double currency = 0.79f; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter the Dollar Amount: ");
			double amount = sc.nextDouble();   
			convertCurrency(amount);
		}
	}
	
	public static void convertCurrency(double amount) { 
		System.out.println(amount*currency); 
	}

}
