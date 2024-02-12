package com.inheritance;

public class Phone implements INotification {
    
    public String sendNotification(String message) {
        // Simulate making a phone call to send the notification
        System.out.println("Making a phone call with message: " + message);
        return "Phone Notification Success";
    }
    
    public static void main(String[] args) {
       
        INotification phoneNotification = new Phone();

        System.out.println(phoneNotification.sendNotification("Hello, this is a phone call!"));
    }
}
