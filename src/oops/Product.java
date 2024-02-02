package com.oops;

public class Product {
	
	// Variables
	String name;
	double price;
	int quantity;
	
	// Method 1
	public void buy() {
		System.out.println("This method is for Buying the product");
	}
	
	// Method 2
	public void sell() {
		System.out.println("This method is for Selling the product");
	}
	
	// Method 3
	public void negotiate() {
		System.out.println("This method is for Negotiating the price");
	}
	
	// main method
	public static void main(String[] args) {
		
		// Creating the Instance of Product
		Product product = new Product();
		
		product.buy();
		product.sell();
		product.negotiate();
		
	}

}
