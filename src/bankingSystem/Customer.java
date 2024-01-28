package bankingSystem;

class Customer {
	public String customerId;
    public String firstName;
    public String lastName;
    public String address;
    public String phoneNumber;
    public int routingNumber;
    public int accountNumber;

    public Customer(String customerId, String firstName, String lastName, String address, String phoneNumber, int routingNumber, int accountNumber) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        
    }

    public String customerId() {
        return customerId;
    }

    public String fullName() {
        return firstName + " " + lastName;
    }
    
    public String accountDetail() {
    	return routingNumber + " " + accountNumber;
    }


}

