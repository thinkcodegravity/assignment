package com.operators;


public class LoginProgram {
	//making global variable using static 
    private static String registeredUserId = "user123";
    private static String registeredPassword = "password123";

    public static void login(String userId, String password) {
        if ((registeredUserId==userId) && (registeredPassword==password)) {
            System.out.println("Login success");
        } else {
            System.out.println("Login failed");
        }
    }

    public static void main(String[] args) {
        login("user123", "password13"); 
    }
}

