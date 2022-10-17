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
		this(n);
		price=p;
	}
	
	public static void main(String[]args) {
		Product p1=new Product("coke");
		System.out.println("Name :" + p1.name);
		
		Product p2=new Product("pepsi", 2.99);
		
		System.out.println("Name : " + p2.name + " and price: " + p2.price);
		
				
	

}
