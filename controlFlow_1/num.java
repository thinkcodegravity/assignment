package controlFlow_1;

import java.util.Scanner;

public class num {

	public static void main(String[] args) {
		
		/* Write a method that takes number as input using for loop
			Print 1 , 2,3 … till the number provided as input 
		*/
		System.out.println(" Enter the number: ");
		 Scanner scan = new Scanner(System.in); 
		 int num = scan.nextInt();
		 input fn = new input();
		 fn.print(num);
		
	}

}
