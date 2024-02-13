package inheritance;

public class cart extends Calculator {
	
	
	
	public int cartCalculator(int productPrice,int productQuantity) {
		int totalCartValue=super.mul(productQuantity, productQuantity);
		return totalCartValue;
	}

}
