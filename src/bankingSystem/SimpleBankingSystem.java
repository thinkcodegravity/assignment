package bankingSystem;

public class SimpleBankingSystem {

    public static void main(String[] args) {
        // Creating a bank
        Bank bank = new Bank("Chase Bank", 1 , 1);

        // Creating a customer
        Customer customer = new Customer("JP Morgan Chase", "Lafas", "Lajir", "262 Watwick Ave", "2325104545", 125364, 9875632);

        // Adding the customer to the bank
        bank.addCustomer(customer);

        // Opening an account for the customer
        Account account = bank.openAccount(customer, 1000.0);

        // Displaying customer details and account balance
        System.out.println("Customer Details: " + customer.fullName() + ", ID: " + customer.customerId());
        System.out.println("Account Balance: $" + account.balance());
    }
}
