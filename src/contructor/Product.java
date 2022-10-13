package contructor;

public class Product {

//Write a program for products
//Product has-a name,quantity,price
//User can construct product 
//By name
//By name and price
	String name;
	int quantity;
	double price;

	public Product(String name) {
		name = "Computer";
	}

	public Product(String name, double price) {
		name = "Computer";
		price = 549.99;

	}
}