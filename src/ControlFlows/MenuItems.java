package ControlFlows;

import java.util.Scanner;

/*
	Write a method to print menu items (use Switch case).
	Display the price for item selected.
	1 – Pizza.
	2 – Pasta.
	Default – salad.
*/

public class MenuItems {

	public static void main(String[] args) {

		while (true) {
			System.out.println("Welcome to Pizza House.");
			System.out.println("*-----*-----*-----*-----*");
			System.out.println("Enter 1 for Pizza.");
			System.out.println("Enter 2 for Pasta.");
			System.out.println("*-----*-----*-----*-----*");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			MenuItems menuItems = new MenuItems();
			menuItems.menu(input);

			System.out.println("Do you want to continue[Y/N]");
			String choice = sc.next();
			if (choice.equalsIgnoreCase("n")) {
				System.exit(0);
			}
		}
	}

	public void menu(int option) {

		switch (option) {

		case 1:
			System.out.println("The price for pizza is $20.");
			break;

		case 2:
			System.out.println("The price for pizza is $10.");
			break;

		default:
			System.out.println("Price for salad is $3.");
		}
	}
}
