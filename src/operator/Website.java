package operator;

public class Website {
	public  int existingUserId = 101;
	
	public void register(int registrationUserId, String password) {
		if(existingUserId == registrationUserId) {
			System.out.println("Registration failed");
		}else {
			System.out.println("Registration success");
		}
	}
	
	public static void main(String[] args) {
		Website w = new Website();
		w.register(102, "paww");
	}
}
