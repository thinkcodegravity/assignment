package control_flow;

import java.util.Scanner;

public class MultiplicationTableTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int num = sc.nextInt();
		
		MultiplicationTable q = new MultiplicationTable();
		q.multiple(num);
		

	}

}
