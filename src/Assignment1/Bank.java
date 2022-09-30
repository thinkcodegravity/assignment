package Assignment1;

public class Bank {
    static String bankName="abc";
    String accountNumber;
    double bankBalance;
    String accountType;
    String customerName;
    String customerEmail;
    int customerPhoneNumber;

    public double depositMoney(double bankBalance, double depositAmount){
        bankBalance = bankBalance + depositAmount;
        return bankBalance;
    }

    public double withdrawMoney(double bankBalance, double withdrawAmount){
        bankBalance = bankBalance - withdrawAmount;
        return bankBalance;
    }

    public static void main(String[] args){

    }

}
