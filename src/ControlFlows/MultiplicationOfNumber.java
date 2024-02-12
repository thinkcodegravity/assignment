package ControlFlows;

import java.util.Scanner;

/*
 * This  Multiplication of Number program has a method multiple which is is designed to have any number multiplication from 1 to 10.
 * When user provide the number input this program gives the multiplication of that input number as an output.
 */

public class MultiplicationOfNumber {
	public boolean multiple(int number) {
		System.out.println("The multiple of " + number + ":");
		int i = 1;
		while (i <= 10) {
			System.out.println(+number + " * " + i + " = " + (number * i));
			i++;

		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number that you want multiplication of:");
		int num = sc.nextInt();
		MultiplicationOfNumber mul = new MultiplicationOfNumber();
		mul.multiple(num);

	}

}
