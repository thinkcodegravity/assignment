package Interface2;

public class Text implements INotification {
	public boolean sendNotification(String message) {
		System.out.println(message);
		return true;
	}
	

}
