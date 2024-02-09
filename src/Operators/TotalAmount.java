package Operators;

public class TotalAmount {
	String productName = "Iphone";

	public double priceAfterDiscount(double price, double DiscountPercentage) {
		double DiscountAmount = price * (DiscountPercentage / 100);//calculating discount amount.
		double totalAmount = price - DiscountAmount;//Calculating total Amount after discount.
		System.out.println("Total amount of "+productName+" after "+DiscountPercentage+"% discount is $"+totalAmount+".");

		return totalAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Creating a reference total.
		TotalAmount total= new TotalAmount();
		total.priceAfterDiscount(1199.99, 20.0); //calling method with value price=1199.99 and discount=20%
	}

}
