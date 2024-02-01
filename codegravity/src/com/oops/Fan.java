package com.oops;

public class Fan {
    // Instance variables
    int speed;
    boolean isOn;
    String color;

    // Method to simulate turning the fan on
    public void turnOn() {
        isOn = true;
        System.out.println("Fan is turned on.");
    }

    // Method to change the fan's speed
    public void changeSpeed(int newSpeed) {
        speed = newSpeed;
        System.out.println("Fan speed changed to " + newSpeed + ".");
    }

    // Method to simulate turning the fan off
    public void turnOff() {
        isOn = false;
        System.out.println("Fan is turned off.");
    }

   
    public static void main(String[] args) {
        // Create an instance of Fan
        Fan myFan = new Fan();

        // Set the instance variables
        myFan.color = "White";
        myFan.speed = 0; // Assuming the fan is off initially
        myFan.isOn = false;

        // Example usage of the methods
       
        myFan.turnOn();
        myFan.changeSpeed(3);
        myFan.turnOff();
    }
}

