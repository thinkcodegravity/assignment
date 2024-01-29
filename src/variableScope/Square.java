package variableScope;

public class Square {
	
	public static int area(int side) {
		
		int area = side * side;
		return area;
	}
	
	public static void main(String[] args) {
		int sideLength = 23;
		
		int calculateArea = area(sideLength);
		System.out.println(calculateArea);
	}
	
	

}
