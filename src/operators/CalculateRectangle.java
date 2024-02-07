package operators;

import java.util.Scanner;

//Create a method that can calculate area of rectangle

public class CalculateRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Rectangle Length: ");
		float length = sc.nextFloat(); 
		System.out.print("Enter the Rectangle Width: ");
		float width = sc.nextFloat(); 
		area(length,width);
	}
	
	public static void area(float length, float width) {
		float area = length*width;
		System.out.print("Area of Rectangle: "+area);
	}

}
