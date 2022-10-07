package operators;


	/*
	 * Create website program
	(has-a)Declare global variable existingUserid 
	Create register method that takes new registeration userid and password
	Based on If exsting userid matches new registeration id then registration fails else registeration method print success or failure.
	 */
public class ExistingUserID {
Long phonereg = 4789651230l;	
String userID ="yadav253";
String Password = "java963";

public String ExistingUsrID( long phoneInput) {
	
if (phoneInput== phonereg) {
	System.out.println(userID);
	 return userID;
}
else{
	return "invalid phone number, Try again";
}

}


public static void main(String[] args ) {
	ExistingUserID UID = new ExistingUserID();
	
	String userID = UID.ExistingUsrID(478965123);
	System.out.println("userid retrieved is:"  +userID );
	
	
}
	
	
}