package DataStructure;
public class BankingSystem {

    Account account = new Account("Savings Account",0.07F);

    Address address = new Address("508 Jefferson Street",
                            "South Dakota",
                            "Vermillion",
                            57069,
                            "USA",
                            3);

   Customer customer = new Customer("Ronaj",
                            "Pradhan",
                            "9849540300",
                            "ronaj.pradhan@gmail.com",
                            address,
                            5000000.56,
                            account);

    public String depositMoney(double moneyToDeposit){
        customer.setCustomersTotalMoney(customer.getCustomersTotalMoney() + moneyToDeposit);
        System.out.println("Money Deposited Successfully!");
        return "Total bank balance: " + customer.getCustomersTotalMoney();
    }

    public String withdrawMoney(double moneyToWithdraw){
        customer.setCustomersTotalMoney(customer.getCustomersTotalMoney() - moneyToWithdraw);
        System.out.println("Money Withdrew Successfully!");
        return "Total bank balance: " + customer.getCustomersTotalMoney();
    }
}