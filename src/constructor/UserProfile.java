package constructor;

public class UserProfile {

	int userid;
	String password;
	String email;
	long phone;
	
	public UserProfile(int userid, String password) {
		this.userid = userid;
		this.password = password;
	}
	
	public UserProfile(String email, String password) {
		this.email = email;
		this.password = password;
	}
	
	public UserProfile(long phone, String password) {
		this.phone = phone;
		this.password = password;
	}

}
