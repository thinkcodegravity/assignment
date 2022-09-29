package control_flow;

import java.util.Scanner;

public class Question5Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		
		Question5 q = new Question5();
		q.multiple(num);
		

	}

}
