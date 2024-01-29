package operator;

public class Currency {
	public static double changeCurrency(double dollar) {
		double uk = dollar * 1.27;
		return uk;
	}
	public static void main(String[] args) {
		double dollar = 23;
		double pound = changeCurrency(dollar);
		System.out.println("UK pound equivalent of "+"$"+dollar+" is "+"£"+pound);
	}

}
