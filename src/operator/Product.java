package operator;

public class Product {
	public static float finalAmount(float price, float discountPercentage) {
		float totalFinalAmount = price - (price * discountPercentage/100);
		return totalFinalAmount;
	}
	public static void main(String[] args) {
		System.out.println("Final Amount is "+finalAmount(100, 10));
	}
}
