package operators;

import java.util.*;

//Method that can calculate sum of 3 numbers and return sum
		
public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number1:");
		int num1 = sc.nextInt();
		System.out.print("Enter number2:");
		int num2 = sc.nextInt();
		System.out.print("Enter number3:");
		int num3 = sc.nextInt();
		
		System.out.println("Total: "+ sum(num1, num2,num3));
	}
	
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

}
