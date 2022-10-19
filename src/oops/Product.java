package oops;

public class Product {
String ProductName="Laptop";
float ProductPrice=950.99f;
int ProductQuantity=10;

//Method for buying product
public float BuyProduct (float CostPrice, int ProductQuantity) {
	CostPrice=800f;
	float TotalCost= CostPrice * ProductQuantity;
	return TotalCost;
}	
// Method to sell the product
	public float SellProduct(float ProductPrice, int ProductQuantity) {
		float TotalPrice=ProductPrice * ProductQuantity;
		return TotalPrice;
	}
	// Method to negotiate 
	public float Negotiate (float ProductPrice, float discount) {
		discount=0.05f;
		float FinalPrice=ProductPrice * discount;
		return FinalPrice;
	}
		
}
