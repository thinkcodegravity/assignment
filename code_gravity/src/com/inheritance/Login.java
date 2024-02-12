package com.inheritance;

public class Login implements ILogin{
	
	public String register(String userId, String password, String email) {
        System.out.println("Attempting to register user with ID: " + userId + " and Email: " + email);
        
        return "Registration success";
    }

    public String login(String userId, String password) {
        System.out.println("Attempting to log in user with ID: " + userId);
        
        return "Login success";
    }

   
    public String changePassword(String userId, String newPassword) {
        System.out.println("Attempting to change password for user with ID: " + userId);
       
        return "Password change success";
    }
    
    public static void main(String[] args) {
        ILogin loginSystem = new Login();

        // Demonstrate calling the methods
        System.out.println(loginSystem.register("srijana", "pass123", "srijana@gmail.com"));
        System.out.println(loginSystem.login("srijana", "pass123"));
        System.out.println(loginSystem.changePassword("srijana", "newPass456"));
    }

}
