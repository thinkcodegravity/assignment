package constructor;

public class Products {
	String name;
	int quantity;
	double price;
	
	public Products(String name_) {
		name = name_;
	}
	
	public Products(String name_, double price_) {
		name = name_;
		price = price_;
	}
}
