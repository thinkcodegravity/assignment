package com.oops;

public class Television {
    // Instance variables
    int channel;
    int volumeLevel;
    boolean isOn;

    // Method to simulate turning the television on
    public void turnOn() {
        isOn = true;
        System.out.println("Television is turned on.");
    }

    // Method to change the television's channel
    public void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Channel changed to " + newChannel + ".");
    }


    // Method to simulate turning the television off
    public void turnOff() {
        isOn = false;
        System.out.println("Television is turned off.");
    }


    public static void main(String[] args) {
        // Create an instance of Television
        Television myTV = new Television();

        // Set the instance variables
        myTV.channel = 1; // Default channel
        myTV.volumeLevel = 10; // Default volume
        myTV.isOn = false;

        // Example usage of the methods
      
        myTV.turnOn();
        myTV.changeChannel(5);
        myTV.turnOff();
    }
}

