package MethodDeclarationAndReturnStatement;

public class MethodAssign11 {
	String userId,password;
	public String userProfile(String userId,String password) {
		if (this.userId==userId &this.password==password) {
			return "profile";
		}
		else {
			return "profile not matched";
		}
	}

}
