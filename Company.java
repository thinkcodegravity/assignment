package Assignment3_Variables;


public class Company {
	  // instance variables
	  private String name;
	  private String address;
	  private String phoneNumber;
	  private String email;

	  // constructor
	  public Company(String name, String address, String phoneNumber, String email) {
	    this.name = name;
	    this.address = address;
	    this.phoneNumber = phoneNumber;
	    this.email = email;
	  }

	  
	  public static void main(String[] args) {
		  // create a Company object with the given details
		   Company company1 = new Company("ACME Inc.", "123 Main Street, Anytown, USA 12345", "555-555-1212", "info@acme.com");

		    // use the printContactInfo method to print the company's contact information
		    company1.printContactInfo();
	  }
		
	  	  
	  // getters and setters for the instance variables
	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getAddress() {
	    return address;
	  }

	  public void setAddress(String address) {
	    this.address = address;
	  }

	  public String getPhoneNumber() {
	    return phoneNumber;
	  }

	  public void setPhoneNumber(String phoneNumber) {
	    this.phoneNumber = phoneNumber;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  // method to print the company's contact information
	  public void printContactInfo() {
	    System.out.println("Name: " + name);
	    System.out.println("Address: " + address);
	    System.out.println("Phone Number: " + phoneNumber);
	    System.out.println("Email: " + email);
	  }
	}
