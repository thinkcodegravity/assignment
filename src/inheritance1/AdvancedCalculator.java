package inheritance1;

public class AdvancedCalculator extends Calculator {
	
	public int Square (int a) {
		
		int areaofSquare = mul (a, a);
		return areaofSquare;
	}
	
	public int Rectangle (int a, int b) {	

		int areaofRectangle = mul (a, b);
		return areaofRectangle;	
		
	}
	
	}


