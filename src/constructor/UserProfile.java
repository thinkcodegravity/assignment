package constructor;

public class UserProfile {
	 String userId,password,email;
	 int phone;
	 
	 public UserProfile(String userId_, String password_) {
		 userId = userId_; 
		 password = password_;
	 }
	 
	 public UserProfile(int phone_, String password_) {
		 phone = phone_; 
		 password = password_;
	 }
	 
	 public UserProfile(String userId_, int phone_, String password_) {
		 userId = userId_;
		 phone = phone_;
		 password = password_;
	 }
}
