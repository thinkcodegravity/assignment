package operators.product;
//– Create a method that can return total final amount , if input provided is product price and discount percentage.
public class Main {

	public static void main(String[] args) {
		float productPrice=122.99f;//here i have used predefined variable with its value since this type of program usually import these values from the database
		float discount =0.1f;
		Prodcut product =new Prodcut(productPrice,discount);
		System.out.println("The total price after discount is : "+product.discountedPrice());
		
	}

}
