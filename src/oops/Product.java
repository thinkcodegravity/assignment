package oops;

public class Product {
	String productName = "Mobile";
	float productPrice = 1000.78f;
	int productQuantity = 10;
	
	public String buyProduct(String Iphone) {
		return Iphone;
	}
	public float sellProduct(float productPrice, int productQuantity) {
		float totalPrice = productPrice * productQuantity;
		return totalPrice;
	}
	
}
