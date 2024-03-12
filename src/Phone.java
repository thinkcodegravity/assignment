package InheritanceAssignmentPPT;

public class Phone implements INotifiaction{
	public Boolean SendNotification(String message) {
		System.out.println("Phone  Notification is "+ message);
		return true;
	}
}
