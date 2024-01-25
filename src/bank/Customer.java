package bank;

/**
 * @author Unish
 *
 */
public class Customer {
	long customerId;
	String firstName;
	String lastName;
	String dateOfBirth;
	String phoneNumber;
	String emailAddress;
	Address address;
	AccountDetails accountDetails;

	public Customer() {
		super();
	}

	public Customer(long customerId, String firstName, String lastName, String dateOfBirth, String phoneNumber,
			String emailAddress, Address address, AccountDetails accountDetails) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
		this.accountDetails = accountDetails;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public AccountDetails getAccountDetails() {
		return accountDetails;
	}

	public void setAccountDetails(AccountDetails accountDetails) {
		this.accountDetails = accountDetails;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress
				+ ", address=" + address + ", accountDetails=" + accountDetails + "]";
	}

}
