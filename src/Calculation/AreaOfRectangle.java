package Calculation;

import java.util.Scanner;

class AreaOfRectangle {

	public static void main(String[] args) {
		//Calculation Area of the Rectangle
		//Full scanner version or input user
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the legth of Rectangle : - ");
		double lenth = scanner.nextDouble();
		System.out.println("Enter the width of the Rectangle :- ");
		double width = scanner.nextDouble();
		double Area = lenth * width;
		System.out.println("Area of the Rectangle is : - " + Area);
		
	}

}
