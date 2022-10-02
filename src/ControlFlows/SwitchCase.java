package ControlFlows;

import java.util.Scanner;

public class SwitchCase {
	// main method
	public static void main(String[] args) {
		boolean value = true;
		while (true) {
			// accepts user input
			Scanner sc = new Scanner(System.in);

			// prompts user to enter a number
			System.out.println();
			System.out.println("Please enter a number: ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("The price for Large pizza is $17.99");
				break;

			case 2:
				System.out.println("The price of pasta is $7.99");
				break;

			default:
				System.out.println("The price of salad is $9.99");

			}
		}
	}
}
