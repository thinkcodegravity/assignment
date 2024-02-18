package inheritance.advancedcalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num3;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter one side length of square");
		num3 =scan.nextInt();
		AdvancedCalcualtor calc =new AdvancedCalcualtor();
		System.out.println("Area of square is ="+calc.areaOfSquare(num3));
		scan.close();
		}

}
