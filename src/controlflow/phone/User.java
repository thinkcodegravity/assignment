package controlflow.phone;

public class User {
	private long registeredPhone =123456789;
	private String userId ="david@gmail.com";
	private	String passWord ="codegravity777";
	public void checkNum(long num) {
		if(num==registeredPhone) {
			System.out.println(userId+" is your UserId");
			}else {
			System.out.println("No data Found");
			}
		}
	public void checkUser(String id) {
		if(id.equals(userId) && id.contains("@") && id.contains(".com")) {
			System.out.println(passWord+" is your password");
		}else {
			System.out.println("No data Found");
			}
	}
}
 