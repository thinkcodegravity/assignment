package OOPFundamentals;

public class Product {
	public String name = "";
	public float price = 10;
	public int quantity = 2;
	
	public void  buy(String name) {
		System.out.println(name);
	}
	public void  sell(float price) {
		System.out.println(price);
	}
	public void  quantity(int quantity) {
		System.out.println(quantity);
	}
}
