package Constructor;

public class UserProfile {
	String userid;
	String password;
	String email;
	String phone;

	public UserProfile(String userid, String password) {
		this.userid = userid;
		this.password = password;
	}

	public UserProfile(String password, String email, String phone) {

		this.password = password;
		this.email = email;
		this.phone = phone;
	}

}
