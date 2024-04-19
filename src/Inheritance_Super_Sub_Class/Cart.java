package Inheritance_Super_Sub_Class;

public class Cart extends calculator{
	int total = 0;
 public int calculateCart(int productPrice, int quantity) {
	 total = mul(productPrice,quantity);
	 System.out.println(total);
	 return total;
 }
}
