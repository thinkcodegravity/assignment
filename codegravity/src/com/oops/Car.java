package com.oops;

public class Car {
    // Instance variables
    String model;
    String color;
    int speed;

    // Method to simulate starting the car
    public void start() {
        System.out.println("Car is starting...");
    }

    // Method to simulate stopping the car
    public void stop() {
        System.out.println("Car is stopping...");
    }

    // Method to simulate accelerating the car
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car();

        // Set the instance variables
        myCar.model = "Toyota Camry";
        myCar.color = "Red";
        myCar.speed = 0; // Assuming the car is stationary at the start

        // Example usage of the methods
        System.out.println("The Model of car is: " + myCar.model);
        System.out.println("The Color of Car is: " + myCar.color);
        
        //method calling
        myCar.start();
        myCar.accelerate();
        myCar.stop();
    }
}

