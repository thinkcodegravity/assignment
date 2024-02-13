package inheritanceInterface;

public class Phone implements INotification{
	public boolean sendNotification(String message) {
		System.out.println("Your notification is in notification center app");
		return  true;
	}
}
