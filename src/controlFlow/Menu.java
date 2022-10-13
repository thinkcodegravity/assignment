package controlFlow;
import java.util.Scanner;

/*
 * Write a method to print menu items (use Switch case)
Display the price for item selected
1 – Pizza
2 – Pasta
Default – salad

 */
public class Menu{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1. for Pizza");
		System.out.println("enter 2. for Pasta");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("The price for Medium pizza is $15.99");
			break;

		case 2:
			System.out.println("The price of pasta is $7.99");
			break;

		default:
			System.out.println("The price of salad is $5.99");

		}
	
		sc.close();
	}
	
	
}




