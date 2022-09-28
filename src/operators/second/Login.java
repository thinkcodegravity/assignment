package operators.second;

public class Login {
	String registerUserId;
	String registerPassword;
	
	public void login(String loginUserId, String loginPassword) {
		if(registerUserId == loginUserId && registerPassword == loginPassword) {
			System.out.println("login success");
		}else {
			System.out.println("login failed, Try again later");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
