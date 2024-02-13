package inheritanceInterface;

public class Login implements ILogin {
	public boolean register(String userId,String password,String email) {
		System.out.println("Welcome to Registeration page");
		return true;
	}
	public boolean login(String enteredUserId,String enteredPassword) {
		System.out.println("Welcome to Login page");
		return true;
	}
	public boolean changePassword(String userId, String newPassword) {
		System.out.println("Change your password here");
		return true;
	}
}
