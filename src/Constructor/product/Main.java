package Constructor.product;

public class Main {

	public static void main(String[] args) {
		Product product =new Product("Asus");
		Product productPrice =new Product(12,2000);
		System.out.println(product.name);
		System.out.println(productPrice.price);
		System.out.println(productPrice.quantity);
	}

}
