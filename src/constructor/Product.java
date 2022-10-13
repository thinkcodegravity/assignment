package constructor;
/*
 * Write a program for products
Product has-a name,quantity,price
User can construct product 
By name
By name and price

 */

public class Product {
	String name;
	int qty;
	double price;
	
	public Product (String n) {
		name=n;
		
	}
	public Product (String n, double p) {
		name=n;
		price=p;
	}
	

}
