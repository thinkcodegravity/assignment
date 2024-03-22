package control_flows;

import java.util.Scanner;

public class Menu {
	public static void getPrices(int input) {
		switch (input) {
		case 1:
			System.out.println("Pizza - $8");
			break;
		case 2:
			System.out.println("Pasta - $10");
			break;
		default:
			System.out.println("Salad - $6");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter \n1 for Pizza \n2 for Pasta");
		int input = scan.nextInt();
		getPrices(input);
		scan.close();
	}
}