package Assignment1;

import java.time.Period;

public class Television {
    String company;
    String model;
    String releaseYear;
    int warrantyPeriod;
    int buyDate;
    int buyMonth;
    int buyYear;

    //currentDate in YYYY/MM/DD format
    public int warrantyPeriodRemaining(int buyDay, int buyMonth, int buyYear, int warrantyPeriod, String currentDate){
        String buyDate = Integer.toString(buyYear) + Integer.toString(buyMonth) + Integer.toString(buyDay);
        int convertedBuyDate =  Integer.parseInt(buyDate);
        int convertedCurrentDate = Integer.parseInt(currentDate);
        if Period.between(convertedBuyDate, convertedCurrentDate).getYears()<=warrantyPeriod){
            return 1;
        }
        else{
            return 0;
        }

    }

    public static void main(String[] args){

    }

}
