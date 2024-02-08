package method;

public class ReturnUserProfile {
	 //Create a method that can return user profile if provided customers userid and password as the input
	String dataBaseUserId,dataBasePassword;
	
	public void userProfile(String customerId, String password){
		if(customerId==dataBaseUserId && password==dataBasePassword) {
			System.out.println("Print all the info of customerId from DataBase");
		}else {
			System.out.println("Access Denied");
		}
	}
}
