package inheritances;

public class AdvancedCalc extends Calculator{
	
	public int squareArea(int length) {
		return super.multiply(length, length);
	}
	
	public int rectangleArea(int length, int breadth) {
		return super.multiply(length, breadth);
	}

}
