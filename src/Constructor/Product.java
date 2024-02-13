package Constructor;
/*
 * Product has-a name,quantity & price. User can construct product By name or By name and price
 */
public class Product {
	//Declaring the variables of class product
	String productName;
	int productQuantity;
	double productPrice;
	
	//Creating Constructor having name as an input
	public Product(String name) {
		productName=name;
		System.out.println("This is "+productName);
		
	}
	//Creating Constructor having name and price as an input
		public Product(String name, double price) {
			productName=name;
			productPrice=price;
			System.out.println(productName+" is on sale for $"+productPrice);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product("Iphone 15");
		Product p2=new Product("Samsung Galaxy S24", 1199.99);
		
		

	}

}
