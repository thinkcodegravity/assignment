package operator.second;

public class Login {
	String registerUserId;
	String registerPassword;
	public void login(String loginUserid, String loginPassword) {
		if (registerUserId==loginUserid && registerPassword == loginPassword);
		System.out.println("Login Successful");
	}
	else{
		System.out.println("Login Failed, Try Again");
	}

}
