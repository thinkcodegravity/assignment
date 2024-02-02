package com.modules;

public class ShoppingCart {
	
	public static double calculateTotalCartValue(int quantity, double price) {
		
		return quantity*price;
	}
	
	public static void main(String[] args) {
		int quantity = 4;
		double price = 100;
		double cartValue = calculateTotalCartValue(quantity, price);
		System.out.println("The total value of cart is " +cartValue);
		
		
		
		
	}
	

}
