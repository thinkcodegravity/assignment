package Constructors;

/*
	Write a program for UserProfile.
	UserProfile has-a userid,password,email,phone.
	Can construct Userprofile,
		1. By userid and password
		2. By userid, email and password
		3. By phone and password
*/

public class UserProfile {

	String userId;
	String password;
	String email;
	long phone;

	public UserProfile(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}

	public UserProfile(String userId, String email, String password) {
		this.userId = userId;
		this.email = email;
		this.password = password;

	}

	public UserProfile(long phone, String password) {
		this.phone = phone;
		this.password = password;
	}
}
