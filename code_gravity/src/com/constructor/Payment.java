package com.constructor;

public class Payment {
    String creditCardNumber;
    String creditCardExpiry;
    String creditCardSecCode;
    String paypalUserId;
    String paypalPassword;

    // Constructor for credit card payment
    public Payment(String ccnb, String cce, String ccsc) {
        creditCardNumber = ccnb;
        creditCardExpiry = cce;
        creditCardSecCode = ccsc;
    }

    // Constructor for PayPal payment
    public Payment(String id, String ppw) {
        paypalUserId = id;
        paypalPassword = ppw;
    }
    
  
   public static void main(String[] args) {
            // Example usage
   Payment payment1 = new Payment("1234567890123456", "12/25", "123");
   Payment payment2 = new Payment("paypalUser", "paypalPass");
        
   }
}

