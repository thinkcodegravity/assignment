package ControlFlows;

import java.util.Scanner;

/*
 	Write a method that takes number as input using for loop
	Print 1 , 2,3 … till the number provided as input 
*/

public class PrintNumbers {

	public static void main(String[] args) {
		PrintNumbers printNumbers = new PrintNumbers();
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a number to print from 1: ");
		int number = input.nextInt();
		printNumbers.printNumber(number);
	}

	public void printNumber(int n) {
		for (int i = 1; i <= n; i++)
			System.out.println(i);
	}
}
