package DataStructure;
public class Customer {
    String firstName;
    String last_name;
    String phoneNo;
    String emailAddress;
    Address address;
    double customersTotalMoney;

    Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public double getCustomersTotalMoney() {
        return customersTotalMoney;
    }

    public void setCustomersTotalMoney(double customersTotalMoney) {
        this.customersTotalMoney = customersTotalMoney;
    }




    public Customer(String firstName, String last_name, String phoneNo, String emailAddress, Address address, double customersTotalMoney, Account account) {
        this.firstName = firstName;
        this.last_name = last_name;
        this.phoneNo = phoneNo;
        this.emailAddress = emailAddress;
        this.address = address;
        this.customersTotalMoney = customersTotalMoney;
        this.account = account;
    }
}