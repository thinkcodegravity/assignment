package com.inheritance;

public class Email implements INotification{
	
	public String sendNotification(String message) {
		System.out.println("Sending email with message" +message);
		return "Email Notification Success";
	}
	
	public static void main(String[] args) {
        INotification emailNotification = new Email();
        

        System.out.println(emailNotification.sendNotification("Hello, this is an email!"));
       
    }

}
