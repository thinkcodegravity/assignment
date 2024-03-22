package control_flows;

import java.util.Scanner;

public class CustomerCare {
	public static void prt(int input) {
		if(input == 1) {
			System.out.println("customer care");
		}
		else {
			System.out.println("other help");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		prt(num);
		scan.close();
	}
}
