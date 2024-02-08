package constructor;

//Write a program for UserProfile
//UserProfile has-a userid,password,email,phone
//Can construct Userprofile
//By userid and password
//By email and password
//By phone and password

public class userProfile {
	String userId="xyz888";
	String password;
	String email="xyz999@gmail.com";
	String phone;
	
	public userProfile(String u,String p) {
		userId=u;
		password=p;
	}
	public userProfile(String e,String pa) {
		email=e;
		password=pa;
	}
	public userProfile(String ph,String pa) {
		phone=ph;
		password=pa;

}
}
