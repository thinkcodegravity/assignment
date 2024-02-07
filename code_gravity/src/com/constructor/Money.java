package com.constructor;


class Money {
    String receiverAccountNumber;
    String receiverPhone;
    String receiverEmail;
    double amount;

    // Constructor with account number and amount
    public Money(String ranb, double a) {
        receiverAccountNumber = ranb;
        amount = a;
    }

    // Constructor with phone and amount
    public Money(String rphn, double a) {
        receiverPhone = rphn;
        amount = a;
    }

    // Constructor with email and amount
    public Money(String re, double a) {
        receiverEmail = re;
        amount = a;
    }
    
  
    public static void main(String[] args) {
    	Money transfer1 = new Money("accountNumber", 100.00);
        Money transfer2 = new Money("receiverEmail@example.com", 50.00);

            // Add code to use these objects as needed
    }
}
