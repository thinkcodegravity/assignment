package ControlFlows;
//Write a method to print multiples of 5 (1-10) using for loop

public class whileLoop {

	public static void main(String[] args) {
		multiples(6);
	}

	public static void multiples(int num) {
		int i = 1;
		while (i < 11) {
			System.out.println(num * i);
			i++;
		}
	}

}
