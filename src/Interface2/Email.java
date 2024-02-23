package Interface2;

public class Email implements INotification {
	public boolean sendNotification(String message) {
		System.out.println(message);
		return true;
	}
	
	
	

}
