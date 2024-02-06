package constructors;

public class UserProfile {
	
	String userId;
	String password;
	String email;
	String phoneNumber;
	
	public UserProfile(String userId,String email, String phoneNumber, String password) {
		if (userId != null) {
			this.userId = userId;
		} else if (email!= null) {
			this.email = email;
		} else if (phoneNumber != null) {
			this.phoneNumber = phoneNumber;
		}
		
		this.password = password;
	}
}
