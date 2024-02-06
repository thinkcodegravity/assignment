package constructors;

public class Products {
	
	String name;
	int quantity;
	int price;
	
	public Products(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Products(String name) {
		this.name = name;
	}

}
