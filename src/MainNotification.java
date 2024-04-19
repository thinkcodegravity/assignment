package InheritanceAssignmentPPT;

public class MainNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email e = new Email();
		e.SendNotification("Hello");
		Text t =  new Text();
		t.SendNotification("How are you?");
		Phone p =new Phone();
		p.SendNotification("You got bonus!");
	}

}
