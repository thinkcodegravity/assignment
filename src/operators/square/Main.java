package operators.square;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		float arr;
		AreaOfSquare square =new AreaOfSquare();
		try(Scanner scan =new Scanner(System.in)){
		System.out.println("Enter one side length of a square");
		square.l=scan.nextFloat();
		}catch(Exception e) {
			e.printStackTrace();
		}
		arr =square.area();
		System.out.println("Area of square is "+arr);
	}
}