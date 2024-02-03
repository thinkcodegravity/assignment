package Operators;

public class Login {
	
	int userId = 100;
	String password = "password";

	public static void main(String[] args) {
		Login login = new Login();
		System.out.println(login.loginUser(100, "wrongpassword"));

	}
	
	public boolean loginUser(int userId, String password) {
		if (userId == this.userId && this.password.equals(password)) {
			return true;
		}
		return false;
	}
	

}
