package operators.second;

public class Website {
	String existingUserId;
	
	public void register(String newRegistrationUserId, String password) {
		if(newRegistrationUserId == existingUserId) {
			System.out.println("Registration fails");
		}else {
			System.out.println("Registration success");
		}
	}

}
