package constructor;

public class Products {
	
	String name;
	int quantity;
	double price;
	
	public Products(String name) {
		this.name = name;
	}
	
	public Products(String name, double price) {
		this.name= name;
		this.price = price;
	}

}
