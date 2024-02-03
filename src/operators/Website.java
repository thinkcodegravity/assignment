package Operators;

public class Website {
	
	int userId = 100;

	public static void main(String[] args) {
		
		Website site = new Website();
		System.out.println(site.registerUser(101, "password"));

	}
	
	public String registerUser(int userId, String password) {
		if (this.userId == userId && password != null) {
			return "UserId already exists";
		}
		return "User successfully created";
	}

}
