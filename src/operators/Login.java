package operators;

public class Login {
	static String userId, password;
	public String login(String loginUserId, String loginPassword) {
		if((userId == loginUserId) && (password == loginPassword)) {
			return "Login Successful";
		}
		else {
			return "Login Failed";
		}
	}
}
