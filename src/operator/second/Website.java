package operator.second;

public class Website {
	String existingUserid;
	public void register(String newRegId, String newPassword) {
		if(existingUserid==newRegId) {
		System.out.println("Registration Failed");				
	}
		else {
			System.out.println("Registration Suuccessful");
		}

}
