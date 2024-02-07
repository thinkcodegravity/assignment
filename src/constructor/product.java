package constructor;


//Write a program for products
//Product has-a name,quantity,price
//User can construct product 
//By name
//By name and price

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	String nameOfProduct="Shirt";
	int quantityOfProduct=10;
	double pricePerUnit=10.99;
	
	public product(String n) {
		nameOfProduct=n;
	}
	public product(String n,double p) {
		nameOfProduct=n;
		pricePerUnit=p;
	}

}
