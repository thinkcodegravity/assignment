package com.inheritance;


public class Text implements INotification {
  
    public String sendNotification(String message) {
        // Simulate sending a text message notification
        System.out.println("Sending text message with message: " + message);
        return "Text Notification Success";
    }
    
    public static void main(String[] args) {
        
        INotification textNotification = new Text();
       
        System.out.println(textNotification.sendNotification("Hello, this is a text message!"));
        
    }
}

