package inheritance;
/*
 * Write a program for advancedCalculator that inherits from Calculator
Method square takes 1 int input and returns int area of square. use multiply from parent
Method rectangle takes 2 int input and returns int area of rectangle… use multiply method from parent

 */

public class AdvanceCal extends Calculator{
	public int square (int y) {
		 int AreaofSq= mul(y, y);
		return AreaofSq;	
		
	}
	
	public int rect(int x , int z) {
		int Arearec= mul(x, z);
		return Arearec;
		
	}
	
	public  static void main (String[]args) {
		AdvanceCal c1= new AdvanceCal();
		int AreaofSq=c1.square(5);
		System.out.println("The area of square :" + AreaofSq);
		int Arearec=c1.rect(7,9);
		System.out.println("The area of rectangle :"+ Arearec);
		
	}
	

}
