package operators;

/*
 * Write a program that has-a registered phone, userid, password
   Create a method to retrieve userid. That will take input as phone and if phone matches registered phone return userid.
   Create a method to retrieve password. That will take input as userid and if userid matches registered userid return password.
 */

public class Login {
	
	long regphone = 4561230789l;
	String userId = "yadav123";
	String password ="java123";
	
	public String retrieveID(long phoneinput) {
		
		if (phoneinput == regphone) {
			System.out.println(userId);
			return userId;
		
		}
		else return "Invalid phone";
	}


public static void main(String[] args) {
	
	Login lg = new Login();
	String userId = lg.retrieveID(4561230789l);
	System.out.println("userid retrieved is:" + userId);
	
}
public String pwdretrive(String Passworduse) {
	
	if (Passworduse == password) {
		System.out.println(password);
		return password;
		
	}
	else {
		System.out.println("unable to retrive password");
		return "Invalid userId";
		
	}
	public  void main(String [] args) {
	
	 {
	Login IN = new Login();
	String userId = IN.pwdretrive( "4561230789");
	System.out.println("password retrieved:" + password );
	}

	

