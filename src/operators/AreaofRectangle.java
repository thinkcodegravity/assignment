package operators;
import java.util.Scanner;

public class AreaofRectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of side");
		int length = sc.nextInt();
		System.out.println("Enter breadth of side");
		int breadth = sc.nextInt();
		
		int area = length*breadth;
		
		System.out.println("Area of Rectangle is: "+area);
		

	}

}
