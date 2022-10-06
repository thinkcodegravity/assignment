import java.util.Scanner;

public class controlFlowPizza {

/*	Write a method to print menu items (use Switch case)
	Display the price for item selected
	1 – Pizza
	2 – Pasta
	Default – salad */


public static void main(String[] args) {
	
	System.out.println("Enter 1 for pizza and 2 for pasta");

	Scanner scan = new Scanner (System.in);
	int menuChoice = scan.nextInt();
	
	switch (menuChoice) {
	
	case 1:
		System.out.println("Price of pizza is $5.");
		break;
	
	case 2:
		System.out.println("Price of pasta is $4.");
		break;
		
	default:
		System.out.println("Price of salad is $14.");
		
		scan.close();
		
		}
	}
}
