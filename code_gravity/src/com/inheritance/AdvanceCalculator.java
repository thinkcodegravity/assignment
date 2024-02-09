package com.inheritance;

class AdvancedCalculator extends Calculator {
    public int square(int side) {
        return mul(side, side);
    }

    public int rectangle(int length, int width) {
        return mul(length, width);
    }
    
    public static void main(String[] args) {
		AdvancedCalculator advCalc = new AdvancedCalculator();
		System.out.println("The area of square:" +advCalc.square(1));
		System.out.println("The area of rectangle:" +advCalc.rectangle(3,2));
		
	
		System.out.println("The addition:" +advCalc.add(1, 1));
		System.out.println("The subtraction:" +advCalc.sub(7, 1));
		System.out.println("The Multiplication:" +advCalc.mul(2, 2));
		System.out.println("The division:" +advCalc.div(6, 2));
	}
}
