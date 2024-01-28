package bankingSystem;

class Bank {
    public String bankName;
    public int customerCount;
    public int accountCount;

    public Bank(String bankName, int i, int j) {
    	this.bankName = bankName;
    	this.customerCount=0;
    	this.accountCount=0;
    }
   
	public void addCustomer(Customer customer) {
        // Assuming only one customer is allowed in this simplified example
        customerCount = customerCount + 1;
        System.out.println("Customer added: " + customer.fullName());
    }

    public Account openAccount(Customer customer, double initialBalance) {
        // Assuming only one account is allowed in this simplified example
        accountCount = accountCount + 1;
        System.out.println("Account opened for customer " + customer.fullName() +
                " with account ID: " + "ACC" + System.currentTimeMillis());

        return new Account(customer, initialBalance);
    }
}