package com.inheritance;

public class Cart extends Calculator {
	public int calculateCart(int price, int quantity) {
        return mul(price, quantity);
    }
	
	public static void main(String[] args) {
		Cart cart = new Cart();
        System.out.println("Cart total (price=100, quantity=2): " + cart.calculateCart(100, 2));
	}

}
