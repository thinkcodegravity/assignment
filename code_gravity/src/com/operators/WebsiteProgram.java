package com.operators;

//Create website program
//(has-a)Declare global variable existingUserid 
//Create register method that takes new registeration userid and password
//Based on If exsting userid matches new registeration id then registration fails else registeration method print success or failure.


public class WebsiteProgram {
    private static String existingUserId = "existingUser";

    public static void register(String newUserId, String password) {
        if (existingUserId==newUserId) {
            System.out.println("Registration failed: User ID already exists.");
        } else {
          
            System.out.println("Registration success.");
        }
    }

    public static void main(String[] args) {
        register("existingUser", "newPass"); // Example usage
    }
}
