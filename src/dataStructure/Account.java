package dataStructure;
public class Account{
    int accountNumber;
    double accountBalance;
    Customer customer;
    Address bankAddress;

    public double deposit(double amount){
        accountBalance = accountBalance + amount;
        return accountBalance;
    }
    public double withdraw(double amount){
        accountBalance = accountBalance - amount;
        return accountBalance;
    }

     public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Address getBankAddress() {
        return bankAddress;
    }
}