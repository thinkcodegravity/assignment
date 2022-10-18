package Constructors;

/*
	Write a program for products
	Product has-a name,quantity,price
	User can construct product 
		1. By name
		2. By name and price
*/

public class Product {

	String name;
	int quantity;
	float price;

	public static void main(String[] args) {
		Product product1 = new Product("Guitar");
		System.out.println("Name : " + product1.name);

		Product product2 = new Product("Bluetooth Speakers", 500);
		System.out.println("Name : " + product2.name + "\n" + "\t" + "Price: " + product2.price);
	}

	public Product(String name) {
		this.name = name;
	}

	public Product(String name, float price) {
		this(name);
		this.price = price;
	}
}
