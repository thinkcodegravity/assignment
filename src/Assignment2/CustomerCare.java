/*
 * This program is using ternary operator to to print the options if the condition is true 
 * or print another option if the condition is false
 */
package Assignment2;
import java.util.Scanner;
public class CustomerCare {

	public static void main(String[] args) {
		 int inputOption;
		 //creating scanner object
		 Scanner sc=new Scanner(System.in);
		 //Taking input from the user
		 System.out.println("Please enter your input option as 1 or 2:");
		inputOption=sc.nextInt();
		
		//Condition for ternary operator
		  String result=inputOption==1? "CustomerCare":"Other Help";
		  //Output
		  System.out.println(result);
	}

}
