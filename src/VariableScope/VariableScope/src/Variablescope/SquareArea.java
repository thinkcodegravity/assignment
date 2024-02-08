package Variablescope;

public class SquareArea {
     public static int area (int side)
     {
    	 int Area = side * side;
    	 return Area;
     }
     public static void main(String args[]) {
    	 int length = 35;
    	 int calculateArea = area(length);
    	 System.out.println("Area of Square is" +calculateArea);
    	 
     }
}
