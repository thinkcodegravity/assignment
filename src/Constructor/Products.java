package Constructor;

public class Products {
	String productName;
	int quantity;
	double price;

	public Products(String productName) {
		this.productName = productName;
	}

	public Products(String productName, double price) {

		this.productName = productName;
		this.price = price;
	}

}
