package Operators;

public class Amazon {
	
	int productStock = 10;

	public static void main(String[] args) {
		Amazon amzn = new Amazon();
		System.out.println(amzn.orderProduct(3));
		
		System.out.println("The remaining stock left is: " + amzn.productStock);
	}
	
	public String orderProduct(int orderQuantity) {
		if (orderQuantity < productStock) {
			productStock = productStock - orderQuantity;
			return "Order is approved";
		}
		return "Product out of stock";
	}
	
	

}
