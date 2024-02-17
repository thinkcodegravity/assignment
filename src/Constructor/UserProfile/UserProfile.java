package Constructor.UserProfile;

public class UserProfile {
	String userId,passWord,email;
	long phone;
	public UserProfile(String userId) {
		this.userId =userId;
	}
	public UserProfile(String userId,String passWord) {
		this.userId =userId;
		this.passWord =passWord;
	}
	public UserProfile(String userId,String email,String passWord) {
		this.email =email;
		this.passWord =passWord;
	}
	public UserProfile(long phone,String passWord) {
		this.phone =phone;
		this.passWord =passWord;
	}
}
