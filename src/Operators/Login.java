package Operators;

public class Login {

	String registerdUserId;
	String registerdPassword;

	public void login(String loginUserId, String loginPassword) {
		if (loginUserId == registerdUserId && loginPassword == registerdPassword) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Login failed, try again");
		}
	}
}
