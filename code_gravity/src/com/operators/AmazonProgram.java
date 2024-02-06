package com.operators;

//Create amazon program
//(has-a)Declare global variable stock
//Create order method. Based on If order quantity is less than stock print order approved or cancelled.


public class AmazonProgram {
	//declare global variable with static
    private static int stock = 100; // Example stock quantity

    public static void order(int quantity) {
        if (quantity <= stock) {
            System.out.println("Order approved!!");
        } else {
            System.out.println("Order cancelled!!");
        }
    }

    public static void main(String[] args) {
        order(10); // Example usage Order approved
    }
}

