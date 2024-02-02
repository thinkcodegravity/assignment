package com.oops;

public class Tree {
    // Instance variables
    String species;
    double heightInMeters;
    int nubBranch;

    // Method to simulate the tree growing taller
    public void grow(double meters) {
        System.out.println("The tree has grown by " + meters + " meters.");
    }

    // Method to simulate the tree getting older
    public void giveFruit() {
        System.out.println("The tree gives fruit or not!!");
    }

    // Method to display the tree's information
    public void displayInfo() {
        System.out.println("This display the information");
    }

    public static void main(String[] args) {
        // Create an instance of Tree
        Tree myTree = new Tree();

        // Set the instance variables
        myTree.species = "Oak";
        myTree.heightInMeters = 5.0; // Initial height in meters
        myTree.nubBranch = 10; // Initial age in years

        // Example usage of the methods
        myTree.grow(1.0); // Simulate the tree growing
        myTree.giveFruit(); // Simulate the tree aging
        myTree.displayInfo(); // Display updated info
    }
}
