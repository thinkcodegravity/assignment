package constructorAssignment;

/*
 	Write a program for products
		Product has-a name,quantity,price
		User can construct product 
			By name
			By name and price

 */
public class Product {
	String name;
	int quantity;
	float price;
	
	public Product(String name) {
		this.name=name;
	}
	public Product(String name, float price) {
		this(name);
		this.price = price;
	}

	public static void main(String[] args) {
		Product p1 = new Product("Shivaraj");
//		String name = p1.name;
		System.out.println(p1.name);
		
		Product p2 = new Product("John", 1000);
		System.out.println("Name : " + p2.name + " and price: " + p2.price);
	}

}
