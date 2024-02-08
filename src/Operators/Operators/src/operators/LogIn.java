package operators;

public class LogIn {
	public class Login {
		public static String registerUserId = "bob77";
		public static String registerPassword = "johnbob99";
		
		public static void login(String loginUserId, String loginPassword) {
			
			if (loginUserId.equals(registerUserId) && loginPassword.equals(registerPassword)) {
				System.out.println("Login successful");
			}else {
				System.out.println("Login failed. User does not exist");
			}
		}
		public static void main(String[] args) {
			login("Bob99", "john");
		}
	}
}
