package Inheritance;

public class Cart extends Calculator {

    public int calculateCart(int productPrice, int quantity){
        return mul(productPrice,quantity);
    }
}
