package constructorAssignment;
/*
 	Write a program for UserProfile
		UserProfile has-a userid,password,email,phone
		Can construct Userprofile
			By userid and password
			By email and password
			By phone and password

 */
public class UserProfile {
	private String userId;
	private String password;
	private String email;
	private long phone;
	
	
	public UserProfile(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	public UserProfile(String email, String password, long phone) {
		this.email = email;
		this.password=password;
		this.phone=phone;
		
	}
	public UserProfile(long phone, String password) {
		this.phone=phone;
		this.password=password;
	}
	
public static void main(String[] args) {
	UserProfile up1 = new UserProfile("John321", "@321123!");
	UserProfile up2 = new UserProfile("John@gmail.com", "@321123!", 9849173559l);
	UserProfile up3 = new UserProfile(9849173559l, "@321123!");
	
	System.out.println(up1.userId);
	System.out.println(up1.password);
	
	System.out.println(up2.email);
	System.out.println(up2.password);
	System.out.println(up2.phone);
	
	System.out.println(up3.phone);
	System.out.println(up3.password);
	System.out.println(up3.userId);
	
	

}
}
