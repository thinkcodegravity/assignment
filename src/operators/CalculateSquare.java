package operators;

import java.util.Scanner;

//Create a method that can calculate area of square
//Accept side as input variable
//Use local variable to calculate area of square


public class CalculateSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Square Side: ");
		double side = sc.nextDouble(); 
		area(side);
	}
	
	public static void area(double side) {
		double area = side * side;
		System.out.print("Area of Square: "+ area);
	}	

}
