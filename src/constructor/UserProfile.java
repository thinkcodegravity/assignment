package constructor;
/*
 * Write a program for UserProfile
UserProfile has-a userid,password,email,phone
Can construct Userprofile
By userid and password
By email and password
By phone and password

 */

public class UserProfile {
	String userid;
	String password;
	String email;
	long phone;
	
	public UserProfile (String ui,String pwd) {
		userid=ui;
		password=pwd;
		
	}
	
	public UserProfile (long ph,String pwd) {
		phone=ph;
		password=pwd;
		
		
		
	}
	
	
	
	
	
	
}
