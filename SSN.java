package Assignment3_Variables;

public class SSN {
		  // instance variables
		  private long ssn = 0;
		  private String firstName = "";
		  private String lastName = "";
		  
		  
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				SSN ssn1 = new SSN(123-456-789, "Charles", "Le Mange");
				ssn1.printDetails();

			}

			
		  // constructor
		  public SSN(long ssn, String firstName, String lastName) {
		    this.ssn = ssn;
		    this.firstName = firstName;
		    this.lastName = lastName;
		  }

		  
		  // getters and setters for the instance variables
		  public long getSsn() {
		    return ssn;
		  }

		  
		  public void setSsn(long ssn) {
		    this.ssn = ssn;
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

		  
		  // method to print all the SSN details
		  public void printDetails() {
		    System.out.println("SSN: " + ssn);
		    System.out.println("First Name: " + firstName);
		    System.out.println("Last Name: " + lastName);
		  }

}
