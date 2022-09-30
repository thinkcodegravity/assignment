package Operators;

public class Website {

	String existingUserId;

	public void register(String newRegistrationUserId, String password) {
		if (newRegistrationUserId == existingUserId) {
			System.out.println("Registration failed. Try different user ID.");
		} else {
			System.out.println("Registration success.");
		}
	}
}
