package operators.circle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the radius of circle in mm to calcualte its area:");
		float radius = scan.nextFloat();
		scan.close();
		CircleArea circle =new CircleArea(radius);
		System.out.println("The area of circle is "+circle.area()+"sq.mm");
	}

}
