package variable_scope;

public class Amazon {
	public String changePassword(String userId, String password){
        if(password.isEmpty()){
            return "Password Update Failed!";
        } else return "Password Updated Successfully!";
	}
}
