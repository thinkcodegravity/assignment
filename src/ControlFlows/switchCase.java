package ControlFlows;

import java.util.Scanner;

public class switchCase {

	
	//***switch expression is evaluated one
	//***value of expression compare with each case
	// break word switch the block
	//defult is use the last statement
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the item selection Pizza for 1 and Pasta for 2 :- ");
		int itemChoice = sc.nextInt();
		
		switch(itemChoice) {
		case 1:
		    System.out.println("Cost of the Small Cheese pizza is :- $7.99");
		    System.out.println("Cost of the Medium Cheese pizza is :- $9.99");
		    System.out.println("Cost of the Large Cheese pizza is :- $12.99");
		    break;
		
		case 2:
		    System.out.println("Cost of the Large Size Pasta is :- $8.99");
		    System.out.println("Cost of the Small Size Pasta is :- $6.99");
		    break;
		
		    default :
		    System.out.println("Cost of the Garden Salad is :-$8.99");	
		
		}
		
	}

}
