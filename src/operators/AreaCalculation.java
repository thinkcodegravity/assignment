package operators;

public class AreaCalculation {
	
	public int squareArea(int a) {
		int areaOfSquare = a * a;
		return areaOfSquare;
	}
	
	public double circleArea(float r) {
		double areaOfCircle = Math.PI*r*r;
		return areaOfCircle;
	}
	
	public float rectangleArea(float l, float b) {
		float areaOfRectangle = l * b;
		return areaOfRectangle;
	}
	
	public float productPrice(float price, int discount) {
		float finalPriceOfProduct = price - (price * discount)/100;
		return finalPriceOfProduct;
	}

}
