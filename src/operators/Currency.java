package Operators;

public class Currency {

	public static void main(String[] args) {
		Currency curr = new Currency();
		System.out.println(curr.convertCurrency(10, "USD"));

	}
	
	public double convertCurrency(int amount, String code) {
		if (code.equals("USD")) {
			System.out.println("$1 US is equivalent to 0.79 Pound");
			return amount * 0.79;
		}
		return 0.0;
	}

}
