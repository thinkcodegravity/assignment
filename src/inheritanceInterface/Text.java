package inheritanceInterface;

public class Text implements INotification {
	public boolean sendNotification(String message) {
		System.out.println("Your notification is:");
		return  true;
	}
}
