package OopsFundamentals;

public class Product {

	public String name;
	public double price;
	public short quantity;

	public double buyProduct(double buyPrice) {
		System.out.println("Buying price for the product is " + buyPrice);
		return buyPrice;  
	}

	public double sellProduct(double sellPrice) {
		System.out.println("Selling price for the product is " + sellPrice);
		return sellPrice;
	}

	public double negotiate(double initialPrice, double discountPrice) {
		double finalPrice = initialPrice - discountPrice;
		System.out.println("Final price of the product is " + finalPrice);
		return finalPrice;
	}
}
