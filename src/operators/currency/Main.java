package operators.currency;

import java.util.Scanner;

//Create currency program
//• Take dollar as input and return the UK pound equivalent


public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter dollar amount");
		float dollar =scan.nextInt();
		scan.close();
		Currency currency =new Currency(dollar);
		System.out.println(currency.curr());
	}

}
