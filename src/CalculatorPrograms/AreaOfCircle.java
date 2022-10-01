package CalculatorPrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		//Calculation of the Area of Circle
		//Area of the cirlce is a=r*r*22/7
		//Workin the full scanner and decimal format
		
		Scanner AC = new Scanner(System.in);
		System.out.println("Enter the radius of the circle :" );
		double r = AC.nextDouble();
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		double a = r*r*Math.PI;
		System.out.println("The area of the circle is  " +(df.format(a)));
		

	}

}
