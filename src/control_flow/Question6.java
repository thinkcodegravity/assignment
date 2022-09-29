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
	
	public void menuItems() {
		System.out.println("enter 1. for Pizza");
		System.out.println("enter 2. for Pasta");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option) {
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
