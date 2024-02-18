package inheritance.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num1,num2;
		int choice;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter num1 = ");
		num1=scan.nextInt();
		System.out.print("enter num2 = ");
		num2 =scan.nextInt();
		System.out.println("press 1 to add, 2 to subtract, 3 to multiply, 4 to divide and 5 to power \n");
		choice =scan.nextInt();
		Child calculate =new Child();
		switch(choice) {
		case 1:
			System.out.println("sum = "+calculate.sum(num1,num2));
			break;
		case 2:
			System.out.println("substract = "+calculate.sub(num1,num2));
			break;
		case 3:
			System.out.println("multiply = "+calculate.mul(num1,num2));
			break;
		case 4:
			System.out.println("division = "+calculate.div(num1,num2));
			break;
		case 5:
			System.out.println("power = "+calculate.power(num1,num2));
			break;
		default:
			System.out.println("try again");	
		}
		scan.close();

	}

}
