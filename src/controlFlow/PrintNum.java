package controlFlow;
/*Write a method that takes number as input using for loop
Print 1 , 2,3 … till the number provided as input 

 */

public class PrintNum {
	public static void main(String[] args) {
		mulitples(3);
	}

	public static void mulitples(int abc) {
		for (int i = 1; i <= 10; i++) {
			System.out.println( i * abc);
		}
	}
}

