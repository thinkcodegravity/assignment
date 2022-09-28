package ControlFlows;
//Write a method to print 1 to 10 using increment operator.

public class IncrementOperator {
	public static void main(String[] args) {
		numbers(1, 11);
	}

	public static void numbers(int a, int b) {

		while (a < b) {
			System.out.println(a);
			a++;

		}

	}

}
