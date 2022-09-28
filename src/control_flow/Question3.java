package control_flow;

public class Question3 {
	/*
	 * Write a program that has-a registered phone, userid, password
	   Create a method to retrieve userid. That will take input as phone and if phone matches registered phone return userid.
	   Create a method to retrieve password. That will take input as userid and if userid matches registered userid return password.
	 */
	
	long phoneRegister = 987654321;
	String userId = "John321";
	String password;
	
	public String idRegistration(long phoneInput) {
		if(phoneInput == phoneRegister) {
			System.out.println(userId);
		}else {
			System.out.println("Not able to find userId");
		}
		return userId;
		
	}
	
	public String pwdRegistration(String loginUserId) {
		if(loginUserId == userId) {
			System.out.println(password);
		}else {
			System.out.println("Not able to retrive password");
		}
		return password;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question3 qq = new Question3();
		qq.idRegistration(987654321);
		qq.pwdRegistration("@java123");
	}

}
