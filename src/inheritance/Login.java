package inheritance;

public class Login implements Ilogin{
	String Ruserid;
	String Rpwd;
	String email;
	
	
	
	
	public void register(String Ruserid, String Rpwd, String email) {
		System.out.println("Your registration is succeessful");
	}
	
	public void login(String Loguserid, String Logpwd) {
		if (Ruserid==Loguserid && Rpwd==Logpwd) {
			System.out.println("login Successful");
		}else {
			System.out.println("Login Unsuccessful, Please try again");
		}
	}
	
		
		public void Changepwd(String userid, String newpwd){
			if (Ruserid==newpwd) {
				System.out.println("Password Change Unsuccessful");
			}else {
				System.out.println("Password Change Successfully");
			}
		}
		
		
		
}

	
	
	