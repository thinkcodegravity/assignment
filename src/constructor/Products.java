package constructor;

/* Write a program for products
Product has-a name,quantity,price
User can construct product 
By name
By name and price

 */

public class Products {
	
	String name;
	int quantity;
	int price; 
	
	public Products (String n) {
		 name = n;
		 
	}
	
	public Products (String n, int p) {
		 
		this(n);
		price = p;
	}

}
