package ControlFlows;

import java.util.Scanner;

/*
	Write a shopping program that has-a balance, product price
	Create a checkout method that takes orderQuantity as input. 
	Calculate total cart price based on quantity input and product price. 
	If total cart prices is less than balance than return success else return failure
 */

public class Shopping {

	double balance = 1000.0;
	double productPrice = 100.0;

	public static void main(String[] args) {
		Shopping shopping = new Shopping();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter quantity of product you want to buy: ");
		int quantity = input.nextInt();

		shopping.checkOut(quantity);
	}

	public String checkOut(int orderQuantity) {
		double totalPrice = orderQuantity * productPrice;
		if (totalPrice < balance) {
			System.out.println("Total price is " + totalPrice);
			return "success";
		} else {
			System.out.println("Sorry you do not have sufficient balance to buy this product.");
			return "failure";
		}
	}
}
