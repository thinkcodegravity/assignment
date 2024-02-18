package inheritance.advancedcalculator;

import inheritance.calculator.Calculator;
//Write a program for advancedCalculator that inherits from Calculator
//Method square takes 1 int input and returns int area of square. use multiply from parent
//Method rectangle takes 2 int input and returns int area of rectangle... use multiply method from parent


public class AdvancedCalcualtor extends Calculator{
	public int areaOfSquare(int num3) {
		int area;
		area =mul(num3,num3);
		return area;
	}
}
