package control_flows;

import java.util.Scanner;

public class PrintNumbers {
	public static void prt(int number) {
		for(int i=1; i != number; i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scan.nextInt();
		prt(input);
		scan.close();
	}
}
