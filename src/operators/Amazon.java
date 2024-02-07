package operators;

import java.util.Scanner;

/*
Create amazon program
(has-a)Declare global variable stock
Create order method. Based on If order quantity is less 
than stock print order approved or cancelled.
*/

public class Amazon {

	static int stock = 500; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter the Order Quantity: ");
			int orderQty = sc.nextInt();   
			order(orderQty);
		}
	}
	
	public static void order(int qty) {
		if(stock >= qty ) {
			System.out.println("Approved");
		}else {
			System.out.println("Cancelled");
		}
	}

}
