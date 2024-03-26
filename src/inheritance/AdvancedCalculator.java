package inheritance;

public class AdvancedCalculator extends Calculator{
	public int square(int s) {
		Calculator c = new Calculator();
		int areaOfSquare = c.mul(s, s);
		return areaOfSquare;
	}
	
	public int rectangle(int l, int b) {
		Calculator c = new Calculator();
		int areaOfRectangle = c.mul(l, b);
		return areaOfRectangle;
	}
}
