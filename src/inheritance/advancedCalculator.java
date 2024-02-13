package inheritance;

public class advancedCalculator extends Calculator {
	

	
	public int square(int side) {
		
		int result1=super.mul(side, side);
		return result1;
	}
	
	public int rectangle(int length,int breadth) {
		int result2=super.mul(breadth, breadth);
		return result2;
	}
	
	
}
