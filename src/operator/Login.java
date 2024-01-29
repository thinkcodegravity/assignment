package operator;

public class Login {
	public static String registerUserId = "101";
	public static String registerPassword = "password";
	
	public static void login(String loginUserId, String loginPassword) {
		
		if (loginUserId.equals(registerUserId) && loginPassword.equals(registerPassword)) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login failed. User does not exist");
		}
	}
	public static void main(String[] args) {
		login("102", "pwd");
	}
}
	