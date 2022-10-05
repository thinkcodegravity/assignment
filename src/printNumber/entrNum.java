package printNumber;

import java.util.Scanner;

/*
  Write a method that takes number as input using for loop
  Print 1 , 2,3 … till the number provided as input 

 */
public class entrNum {

	public static void main(String[] args) {
		
		System.out.println("Enter number: ");
		  
		  Scanner scan = new Scanner (System.in);
		  int num = scan.nextInt();
		  printNum n = new printNum();
		  n.print(num);
	}

} 
