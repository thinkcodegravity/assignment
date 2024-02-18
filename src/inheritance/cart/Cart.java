package inheritance.cart;

import inheritance.calculator.Calculator;
//Write a program for Cart that inherits from calculator
//Method calculateCart that takes 2 int input product price and quantity and returns total value of cart..
//Use parent method multiply.
public class Cart extends Calculator{
	
	public int calcualteCart(int productPrice, int quantity) {
		return mul(productPrice,quantity);
		
	}
}
