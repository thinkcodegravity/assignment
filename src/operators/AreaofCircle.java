package operators;
import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int rad  = sc.nextInt();
		
		float pi = 3.14f;
		
		float area = pi*rad*rad;
		
		System.out.println("Area of circle is: "+area);
		
		
		
		

	}

}
