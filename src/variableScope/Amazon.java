package variableScope;

public class Amazon {
	
	public static boolean changePassword(int userId, String password, String confirmPassword) {
		
		//Local Variable age
		int age = 34;
		
		if (password.equals(confirmPassword)) {
			return true;			
		}
		return false;
	}

}
