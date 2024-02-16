package controlflow.forloop;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the value of n");
		n= scan.nextInt();
		scan.close();
		PrintInput printInput =new PrintInput(n);
		printInput.print();
	}

}
