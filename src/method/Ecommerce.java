package method;

public class Ecommerce {
	
	 String userName;
	String userPassword;
	
	public void idRegistration(String userName, String userPassword) {
		if(userName=="a" & userPassword=="b") {
			System.out.println("You Sucessfully logged in!");
		}
		else {
			System.out.println("Not able to login. Please try again!");
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Ecommerce in = new Ecommerce();
		in.idRegistration("a", "b");
		;
	}

}
