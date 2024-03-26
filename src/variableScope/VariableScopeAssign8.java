package variableScope;

public class VariableScopeAssign8 {
	String userid;
	String password;
	public String changePassword(String userid,String newpassword) {
		if(this.userid==userid & password!=newpassword) {
			byte age=0;
			return "successfully changed";
			
		}
		else {
			return "password change is failed";
		}
	}
}
