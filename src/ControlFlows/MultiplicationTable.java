package ControlFlows;

import java.util.Scanner;

/*
	Write a method that takes number as input using while loop.
	Print multiple of 1 to 10 for this input.
*/

public class MultiplicationTable {

	public static void main(String[] args) {
		MultiplicationTable mulTable = new MultiplicationTable();
		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a number to generate multiplication table: ");
			int userNum = input.nextInt();
			mulTable.multiplication(userNum);
			
			System.out.println("Do you want to continue[Y/N]");
			String choice = input.next();
			if (choice.equalsIgnoreCase("n")) {
				System.exit(0);
			}
		}
	}

	public void multiplication(int num) {
		int i = 1;
		while (i <= 10) {
			System.out.println(num + " * " + i + " = " + num * i);
			i++;
		}
	}
}
