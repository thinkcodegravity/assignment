package operators;
import java.util.Scanner;

public class AreaofSquare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of side");
		int side = sc.nextInt();
		
		int length = side;
		int area = length*length;
		
		System.out.println("Area of Square is: "+area);
		

	}

}
