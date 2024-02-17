package Constructor.product;

//Write a program for products
// Product has-a name,quantity,price
// User can construct product
// By name
// By name and price
public class Product {
	String name;
	int quantity;
	int price;
	public Product(String name){
		this.name =name;
	}
	public Product(int quantity,int price) {
		this.quantity =quantity;
		this.price =price;
	}
}
