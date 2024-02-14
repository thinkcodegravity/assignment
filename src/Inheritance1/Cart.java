package Inheritance1;

public class Cart extends Calculator {
	
	//method to calculate cart value
	public int calculateCart(int productPrice, int productQuantity ) {
		//Parent class method use to perform multiplication
		int totalValueOfCart=super.mul(productQuantity, productPrice);
		System.out.println("Iphone 11 Price is $"+productPrice+".");
		System.out.println("The total amount of "+productQuantity+" I-Phone 11 is $"+totalValueOfCart);
		return totalValueOfCart;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart value=new Cart();
		//method calling statement
		value.calculateCart(500, 5);

	}

}
