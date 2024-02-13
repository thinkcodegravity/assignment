package inheritanceInterface;

public class Email implements INotification {
	public boolean sendNotification(String email) {
		System.out.println("Your notification is in your email");
		return  true;
	}

}
