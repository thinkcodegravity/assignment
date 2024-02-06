package com.operators;

public class Operators {

    // Method to calculate the sum of three numbers
    public static int sumOfThree(int a, int b, int c) {
        return a + b + c;
    }

    // Method to calculate simple interest
    public static double simpleInterest(double principal, double time, double rate) {
        double interest = (principal * time * rate) / 100;
        return interest;
    }

    // Method to calculate the area of a square
    public static double areaOfSquare(double side) {
        double area = side * side;
        return area;
    }

    // Method to calculate the area of a circle
    public static double areaOfCircle(double radius) {
        final double pi = Math.PI;
        double area = pi * radius * radius;
        return area;
    }

    // Method to calculate the area of a rectangle
    public static double areaOfRectangle(double length, double width) {
        double area = length * width;
        return area;
    }

    // Method to calculate the final amount after a discount
    public static double finalAmount(double price, double discountPercentage) {
        double discountAmount = (price * discountPercentage) / 100;
        double finalAmount = price - discountAmount;
        return finalAmount;
    }

    public static void main(String[] args) {
        // Testing the methods
        System.out.println("Sum of 1, 2, 3: " + sumOfThree(1, 2, 3));
        System.out.println("Simple Interest (P=1000, T=2, R=5): " + simpleInterest(1000, 2, 5));
        System.out.println("Area of Square (side=4): " + areaOfSquare(4));
        System.out.println("Area of Circle (radius=3): " + areaOfCircle(3));
        System.out.println("Area of Rectangle (length=4, width=5): " + areaOfRectangle(4, 5));
        System.out.println("Final Amount (Price=1000, Discount=10%): " + finalAmount(1000, 10));
    }
}

