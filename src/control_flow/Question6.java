package control_flow;

import java.util.Scanner;

/*
Write a method to print menu items (use Switch case)
Display the price for item selected
1 – Pizza
2 – Pasta
Default – salad

 */
public class Question6 {
	
	public void menuItems(int userChoice) {
		
		
		switch(userChoice) {
		case 1: 
			System.out.println("The price of pizza is: $15");
			break;
		case 2:
			System.out.println("The price for Pasta is: $10");
			break;
		default :
			System.out.println("Salad for $5");
		}
		
	}

}
