//weird that UserProfileConst can pull both userID, pw and email, pw 

package constructors.userprofile;

public class UserProfileConst {
	
	String userID;
	String password;
	long phoneNum;
	
	public UserProfileConst (String a, String b) {
		userID = a;
		password = b;
		
		System.out.println(userID);
		System.out.println(password);
		
	}	
	
	public UserProfileConst (long a, String b) {
		phoneNum = a;
		password = b;
		
		System.out.println(phoneNum);
		System.out.println(password);
		
	}

}
