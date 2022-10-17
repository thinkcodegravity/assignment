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
	
	public UserProfile (String em, String pwd, long ph) {
		email=em;
		password=pwd;
		phone=ph;
		
		
			
		
	}
	public UserProfile  (long ph, String pwd) {
		phone=ph;
		password=pwd;
		
		
	
		
	}
	
	
	public static void main (String[]args) {
		UserProfile usp1=new UserProfile("gangalm","lama");
		System.out.println("Userid :" + usp1.userid );
		System.out.println("Password :"+ usp1.password);
		
		UserProfile usp2=new UserProfile("ganga@mail", "lama", 123456789);
		System.out.println("Email :" + usp2.email);
		System.out.println("Password :" + usp2.password);
		System.out.println("Phone :" + usp2.phone);


		UserProfile usp3=new UserProfile(123456789,"javaclass");
		System.out.println("Phone :" + usp3.phone);
		System.out.println("Password :" + usp3.password);


		
		
	}
	
	
	
	
	
	
}
