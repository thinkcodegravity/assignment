package controlFlow;

import java.util.Scanner;

public class InputusingLoop {

	/*
	 * Write a method that takes number as input using while loop Print multiple of
	 * 1 to 10 for this input
	 * 
	 */
	
	public static void main(String[] args) {
		InputusingLoop loop = new InputusingLoop();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to generate multiplication Table: ");
		int num = sc.nextInt();
		
		loop.multiplicationTable(num);
		
	}

	public void multiplicationTable(int input) {

		for (int i = 1; i <= 10; i++) {

			// i++ = i = i+1
			// 5 * 1 = 5
			// 5 * 2 = 10
			System.out.println(input + " * " + i + " = " + input * i);
		}
	}
}
