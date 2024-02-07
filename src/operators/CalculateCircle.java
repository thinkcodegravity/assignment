package operators;

import java.util.Scanner;

//Create a method that can calculate area of circle.
//Accept radius as input variable
//Use local variable to calculate area of circle

public class CalculateCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Cicle Radius: ");
		float radius = sc.nextFloat(); 
		area(radius);
	}
	
	public static void area(float r) {
		float area = 3.14f *r* r;
		System.out.print("Area of Circle: "+area);
	}

}
