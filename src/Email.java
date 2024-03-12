package InheritanceAssignmentPPT;

public class Email implements INotifiaction{
	public Boolean SendNotification(String message) {
		System.out.println("email Notification is "+ message);
		return true;
	}
}
