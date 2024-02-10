package Operators2;

import java.util.Scanner;
/*
 * Amazon program does order, if the user placed the number of order less than or equal to stock quantity.
 * Order will be placed successfully else it will be out of stock.
 */

public class Amazon {

	// Declaring the variables
	int stock = 50;

	public boolean Order(int OrderQuantity) {
		if (OrderQuantity <= stock) {
			// if order quantity is less than or equals to stock
			System.out.println("Order placed Successfully!");

			return true;
		} else {

			// if order quantity is more than stock
			System.out.println("out of stock");

			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon amz = new Amazon();
		System.out.println("Welcome to Amazon");
		System.out.println("please enter number of order you want to place:");

		// Scanner sc to take number of order from the user
		Scanner sc = new Scanner(System.in);
		int placeOrderQuantity = sc.nextInt();

		// Method calling statement
		amz.Order(placeOrderQuantity);

	}

}
