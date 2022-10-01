package CalculatorPrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// Area of Triangle with user input
		//Area of Triangle is (b*h)/2
		
		Scanner AT = new Scanner(System.in);
		System.out.println("Enter the base of the traingle is  ");//Enter the base
		double Base = AT.nextDouble();                            //Scanner for user input
		
		
		System.out.println("Enter the height of the triangle  "); //Enter the height
		double Height = AT.nextDouble();                          //user in put
		
		
		double AreaOfTriangle = (Base * Height)/2;                //Formula for area of Triangle
		System.out.println("Area of triangle is " + AreaOfTriangle); //Output result
		
		
		DecimalFormat df = new DecimalFormat();                   //Code for decimal formate
		df.setMaximumFractionDigits(2);                           //Decimal format 2 and choice
	}
	;
	
	

}
