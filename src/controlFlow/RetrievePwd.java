package controlFlow;
 	/*Write a program that has-a registered phone, userid, password
 	 * 
 	 	*Create a method to retrieve userid. That will take input as phone and 
		if phone matches registered phone return userid.
		
 	 	*Create a method to retrieve password. That will take 
			input as userid and if userid matches registered userid return password.

 */



public class RetrievePwd {
	long phoneRegister=12345678;
	String userId="ganga";
	String password;
	
	public String idRegistration (long phoneInput) {
		if(phoneInput==phoneRegister) {
		System.out.println("userId");
		return userId;
	}else {
		return "Invalid phone";
		
	}
	
	
			}
	
	public static void main(String[]args) {
		RetrievePwd qq=new RetrievePwd ();
		String userId=qq.idRegistration(12345678);
		System.out.println("userId retrieved is:" +userId);
		
			
		}
	public String pwdRegistration(String loginUserId) {
		if(loginUserId==userId) {
		System.out.println("password");
		return password;
		
		}else {
			System.out.println("Not able to retrieve password");
			return "invalid userid";
			
		}
	}

}
