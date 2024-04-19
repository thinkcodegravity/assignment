package InheritanceAssignmentPPT;

public class Text implements INotifiaction{
	public Boolean SendNotification(String message) {
		System.out.println("Text  Notification is "+ message);
		return true;
	}
}
