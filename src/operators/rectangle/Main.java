package operators.rectangle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float l,b;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter value of length and breadth of a rectangle in cm");
		l= scan.nextFloat();
		b= scan.nextFloat();
		scan.close();
		Rectangle rectangle =new Rectangle(l,b);
		System.out.println("The area of the rectangle is ="+rectangle.area()+"sq.cm");
		
	}
}
