/*
 * This program is created to show the multiplication of 6 using while loop
 */
package Assignment2;

public class MultiplicationOfSix {

	public static void main(String[] args) {
		int count=1;
		int number=6;
		System.out.println("The Multiplication table of "+number);
		//using while loop for the multiplication
		while (count<=10) {
			
			System.out.println(number+" X "+count+" = "+number*count);
			
			count+=1;
		}
		}	

	}


