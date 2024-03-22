package operators;

public class Website {
	static String existingUserid;
	public String register(String userId, String password) {
		if(existingUserid == userId) {
			return "Registration Failed";
		}
		else {
			return "Registration Successful";
		}
	}
}
