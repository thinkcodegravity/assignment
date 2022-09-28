package ControlFlows;
//Write a method to print multiples of 5 (1-10) using for loop

public class ForLoop {
	public static void main(String[] args) {
		mulitples(5);
	}

	public static void mulitples(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + " = " + i * num);
		}
	}
}
