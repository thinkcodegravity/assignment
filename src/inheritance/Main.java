package inheritance;

public class Main {
	public static void main(String[] args) {
	
	Authentication userAuth =new Authentication();
	String result = userAuth.registration("newUser1","123456789");
	System.out.println(result);
	System.out.println(userAuth.login("newUser1", "123456789"));
	System.out.println(userAuth.changePassword("newUser1", "987654321"));
	
	}
}
