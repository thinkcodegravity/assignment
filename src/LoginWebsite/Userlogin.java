package LoginWebsite;

public class Userlogin {

	private String userId = "david";
	private String password = "1234";

	//
	private void Userlogin(String userId, String password) {
		if ((userId == this.userId) && (password == this.password)) {
			System.out.println("You've successfully logged in");
		} else {
			System.out.println("Please check your credentials");
		}
	}

	public static void main(String[] args) {
		Userlogin checkuser = new Userlogin();
		checkuser.Userlogin("david", "124");
	}

}
