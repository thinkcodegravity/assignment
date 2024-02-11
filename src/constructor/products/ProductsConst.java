package constructor.products;

public class ProductsConst {
	
	String product;
	int quantity;
	int price;
	
	public ProductsConst (String a) {
		product = a;
		
		System.out.println(product);
	}
	
	public ProductsConst (String a, int b) {
		product = a;
		price = b;
		
		System.out.println(product);
		System.out.println(price);
		
		
	}
}
