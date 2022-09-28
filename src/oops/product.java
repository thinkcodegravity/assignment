package oops;

public class product {
String name="Iphone";
double price=999.9;
int quantity=10;
String color="blue";

public double buyProduct() {
	int productNumber=5;
	double productCost=price*productNumber;
	
	System.out.println("Your total is $"+productCost+" for"+productNumber+" "+color+name);
	return productCost; 

}

}