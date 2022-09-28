
public class Product {
String name="Iphone";
double price=999.9;
int quantity=10;

public double buyProduct() {
	int productNumber=5;
	double productCost=price*productNumber;
	
	System.out.println("Your total is $"+productCost+" for"+productNumber+" "+name);
	return productCost; 

}

}
