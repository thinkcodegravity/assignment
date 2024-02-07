package com.constructor;

//Write a program for UserProfile
//UserProfile has-a userid,password,email,phone
//Can construct Userprofile
//By userid and password
//By email and password
//By phone and password

public class UserProfile {
    String userId;
    String password;
    String email;
    String phone;
    

    // Constructor with userId and password
    public UserProfile(String id, String pw) {
        userId = id;
        password = pw;
    }

    // Constructor with email and password
    public UserProfile(String e, String pw {
        email = e;
        password = pw;
    }

    // Constructor with phone and password
    public UserProfile(String ph, String pw) {
        phone = ph;
        password = pw;
    }
    
   
    public static void main(String[] args) {
    	UserProfile user1 = new UserProfile("user123", "password123");
    	UserProfile user2 = new UserProfile("email@example.com", "password123");

}
}
