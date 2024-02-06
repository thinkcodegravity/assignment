package com.operators;

//Create currency program
//Take dollar as input and return the UK pound equivalent

//For Our Knowledge
//Sterling (ISO code: GBP) is the currency of the United Kingdom
//US Dollar(USD) is the currency of the United States

public class CurrencyConverter {
    private static double usdToGbpRate = 0.75;

    public static double convertUsdToGbp(double dollars) {
        return dollars * usdToGbpRate;
    }

    public static void main(String[] args) {
        System.out.println("100 USD in GBP: " + convertUsdToGbp(100)); 
    }
}

