package Operators;

public class Bank {
    double balance = 100000;

    public double withdraw(double withdrawAmount){
        if(balance < withdrawAmount){
            return balance -=  withdrawAmount;
        } else{
            System.out.println("Withdraw amount more than bank balance!");
            return 0;
        }
    }

    public double deposit(double depositAmount){
        if(depositAmount > 1){
            return balance += depositAmount;
        }else {
            System.out.println("Invalid withdraw amount!");
            return 0;
        }
    }

    public double sum(int a, int b, int c){
        return a + b + c;
    }

    public double simpleInterest(double p, double t, double r){
        double sI = (p * t * r)/100;
        return sI;
    }



}
