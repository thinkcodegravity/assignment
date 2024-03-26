package inheritance;

public class Text implements INotification {
	
	public void sendNotification(String message) {
		
		if (message.isEmpty()) {
		System.out.println("Text failed");
		}
		else {
			System.out.println("Text notification sent successfully");
		}
	}
}