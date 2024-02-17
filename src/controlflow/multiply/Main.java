package controlflow.multiply;

import java.util.Scanner;
//Write a method that takes number as input using while loop 
//Print multiple of 1 to 10 for this input
public class Main {
	public static void main(String[] args) {
		int input;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter any whole number to know its multiplication table");
		input =scan.nextInt();
		Multiply multiply =new Multiply(input);
		multiply.mul();
	}

}
