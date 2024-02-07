package com.constructor;

public class Product {
	
	String name;
    int quantity;
    double price;

    // Constructor with name
    public Product(String n) {
        name = n;
    }

    // Constructor with name and price
    public Product(String n, double p) {
    	name = n;
        price = p;
    }
    
    
    public static void main(String[] args) {
    	// Example usage
        Product product1 = new Product("Laptop");
        Product product2 = new Product("Smartphone", 999.99);
    }

}
