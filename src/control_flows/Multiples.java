package control_flows;

import java.util.Scanner;

public class Multiples {
	public static void getMultiples(int number) {
		int i = 1;
		System.out.println("Multiples of " + number +":");
		while(i<=10) {
			System.out.println(number * i);
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = scan.nextInt();
		getMultiples(input);
		scan.close();
	}
}
