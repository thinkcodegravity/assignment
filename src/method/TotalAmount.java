package method;

public class TotalAmount {
	  //– Create a method that can return total amount if input provided is product		
	  //price and discount percentage.
	public float totalAmount(float productPrice, float percentage){
		return productPrice-(percentage/100)*productPrice;
	}
}
