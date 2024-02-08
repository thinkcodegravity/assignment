package variableScope;


//Amazon program has method changePassword that takes user id and new password and confirms if password update was success or failure

public class Amazon {
	//parametric variable since the input is given by user to you
	String password;
	public void changePassword(String userId, String newPassword) {
	//logic to replace old password stored in database with new password and notify if its successfull or not
	this.password= newPassword;
	if(this.password==newPassword) {
		System.out.println("Successfully changed");
	}else{
		System.out.println("password couldnt be changed,Try Again");
		}
	}
}
