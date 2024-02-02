package com.modules;


public class RectangleAreaCalculator {
	
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        double length = 10.5; // Example length
        double width = 4.0; // Example width
        // calling the method, This is done in the same program
        double area = calculateArea(length, width);
        System.out.println("The area of the rectangle is: " + area);
    }
}

