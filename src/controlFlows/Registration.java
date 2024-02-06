package controlFlows;

public class Registration {
	
	long phoneNumber = 1234567890;
	int userId = 123;
	String password = "password";

	public static void main(String[] args) {
	}
	
	public int getUserId(int phoneNumber) {
		if (this.phoneNumber == phoneNumber) {
			return this.userId;
		}
		return 0;
	}
	
	public String getPassword(int userId) {
		if (this.userId == userId) {
			return this.password;
		}
		return "Incorrect user id";
	}

}
