package CalculatorPrograms;

import java.util.Scanner;

public class AlgebraCalculating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a :  ");
		float a = scanner.nextFloat();
		
		System.out.println("Enter the value of b : ");
		float b = scanner.nextFloat(); 
		
		//This code for the Math Power
		//formula (a+b)2 =a2 +2ab+b2
		double c = Math.pow(a,2) + 2*a*b + Math.pow(b, 2);  
		
		System.out.println("The value of (a + b)2 is " + c);
		
		
	}

}
