package Inheritance1;
import java.util.Scanner;
/*
 * AdvancedCalculator is a program  that inherited from Calculator program. This program have all the methods inherited from
 * parent class Calculator.
 */

public class AdvancedCalculator extends Calculator {
	
	public int square(int l) {
		AdvancedCalculator ac=new AdvancedCalculator();	
		//Calling parent class multiplication method to child class 
		int areaOfSquare=mul(l, l);
		System.out.println("Area of Square: "+areaOfSquare+" square unit.");
		return areaOfSquare;
		
	}
	public int rectangle(int l, int w) {
		//Calling parent class multiplication method to child class
		int areaOfRectangle=mul(l, w);
		System.out.println("Area of Rectangle: "+areaOfRectangle+" square unit.");
		
		return areaOfRectangle;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*******Area Of Square*******");
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the side of Square:");
		int side=sc.nextInt();
		AdvancedCalculator ac=new AdvancedCalculator();
		ac.square(side);//method calling statement
		System.out.println("****************************************************************************");
		System.out.println("*******Area Of Rectangle*******");
	
		System.out.println("Please enter the length of Rectangle:");
		int length=sc.nextInt();
		
		System.out.println("Please enter the width of Rectangle:");
		int width=sc.nextInt();
		ac.rectangle(length, width);//method calling statement
		System.out.println("****************************************************************************");
	}

}
