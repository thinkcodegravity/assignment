package inheritance1;

public class CalculatorMain {

	public static void main(String[] args) {
		
		int squareLength = 2;
		
		int rectangleLength = 3;
		int rectangleBreadth = 4;
		
		int productPrice = 10;
		int productQuantity = 5;
		
		AdvancedCalculator calc = new AdvancedCalculator();
		Cart cart = new Cart();
		
		int a = calc.Square(2);
		System.out.println("Area of Square is : "+a);
		
		int b = calc.Rectangle (3, 4);
		System.out.println("Area of Rectangle is: "+b);
		
		int c = cart.calculateCart (10 ,5);
		System.out.println("Value of Cart is: " +c);
	}

}
