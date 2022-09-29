package control_flow;

import java.util.Scanner;

/*
 * Write a shopping program that has-a balance, product price
	Create a checkout method that takes orderquantity as input. 
	Calculate total cart price based on quantity input and product price. 
	If total cart prices is less than balance than return success else return failure

 */
public class ShoppingQuestion4 {
	int balance = 10000;
	float productPrice = 999.9f;
	
	public String checkOut(int orderQuantity) {
		float totalCartPrice = orderQuantity * productPrice;
		if(totalCartPrice < balance) {
			return "success";
		}else {
			return "failure";
		}
	}

	public static void main(String[] args) {
		ShoppingQuestion4 sq4 = new ShoppingQuestion4();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of order");
		int orderNumber = sc.nextInt();
		String shopping = sq4.checkOut(orderNumber);
		System.out.println(shopping);

	}

}
