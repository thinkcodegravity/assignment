package inheritance.inotification;

public class Main {

	public static void main(String[] args) {
		Email email =new Email();
		Text text =new Text();
		Phone phone =new Phone();
		System.out.println(email.sendNotification("sdfghj"));
		System.out.println(text.sendNotification("sdfghj"));
		System.out.println(phone.sendNotification("sdfghj"));
	}

}
