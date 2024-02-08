package operators;

public class WebSite {
	public String existingUserid= "Bob121";
	
	public void register(String registerUserid , String Password) {
		if(existingUserid == registerUserid ) {
			System.out.println("Registration Failed");
		}
		else {
			System.out.println("Registration Success");
		}
	}
	public static void main(String args[]) {
		WebSite w = new WebSite();
		w.register("bob99","john2");
	}

}
