package controlFlow;

import java.util.Scanner;

	/*
	 * write a shopping program that has-a balance, product price
	 Create a checkout method that takes orderquantity as input.
	 Calculate total cart price based on quantity input and product price. 
	 If total cart prices is less than balance than return success else return failure
	 */
public class ShopingCart {
	
	double balance = 1000.0;
	double productPrice = 100.0;
	
	
	public static void main(String[] args) {
		
		ShopingCart cart = new ShopingCart();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter quantity: ");
		int quantity = sc.nextInt();
		
		cart.checkOut(quantity);
		
	}
	
	public String checkOut(int orderQuantity) {
		double totalPrice = orderQuantity * productPrice;
		
		if(totalPrice < balance) {
			System.out.println("Total price is: "  +totalPrice);
			return "success";
		}
		else {
			System.out.println("Sorry you don't have enough balance");
			return "failure";
		}
		
	}
	
	
	
	
//	public int checkout=(int inputQTY);
//	
//Scanner sc = new Scanner(System.in);
//}
//
//public int cartPrice() {
//	
//	int cartPrice = inputQTY* productPrice;
//}
//if{ 
//{balance>cartPrice}
//System.out.println(successfull)
//else
//	System.out.println(Failure);
// 
//		
		
}
