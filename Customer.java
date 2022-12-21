package Assignment3_Variables;
	
public class Customer {
		  // instance variables
		  private String username;
		  private boolean online;

		  
		  public static void main(String[] args) {
			  Customer c1 = new Customer("Wayne.Rooney", true);
			  c1.printStatus();
			  Customer c2 = new Customer("Didier.Drogba", false);
			  c2.printStatus();
			}

		  
		  // constructor
		  public Customer(String username, boolean online) {
		    this.username = username;
		    this.online = online;
		  }

		  // getters and setters for the instance variables
		  public String getUsername() {
		    return username;
		  }

		  public void setUsername(String username) {
		    this.username = username;
		  }

		  public boolean isOnline() {
		    return online;
		  }

		  public void setOnline(boolean online) {
		    this.online = online;
		  }

		  // method to print the customer's online status
		  public void printStatus() {
		    if (online) {
		      System.out.println(username + " is online.");
		    } else {
		      System.out.println(username + " is offline.");
		    }
		  }
		
	
	
}
