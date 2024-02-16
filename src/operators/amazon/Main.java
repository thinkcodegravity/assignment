package operators.amazon;

import java.util.Scanner;

//Create amazon program
//• (has-a)Declare global variable stock
//• Create order method. Based on If order quantity is less than stock print order approved or cancelled.

public class Main {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter no of order");
		int order=scan.nextInt();
		scan.close();
		Amazon amazon =new Amazon(order);
		amazon.order();
	}

}
