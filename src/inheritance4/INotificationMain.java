package inheritance4;

public class INotificationMain {

	public static void main(String[] args) {
		
		String email = "sundaesholi@gmail.com";
		String phone = "call 5712453434";
		String text = "text 5712453434";
		
		Email e = new Email();
		Phone p = new Phone();
		Text t = new Text ();
		
		e.sendNotificationEmail(email);
		p.sendNotificationPhone(phone);
		t.sendNotificationText(text);
	}

}
