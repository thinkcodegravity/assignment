package method;

public class InsuranceDetail {

	
	//Create a method that can return insurance detail if provided input as age.
	
	
	byte dataBaseAge;
	String dataBaseUserId;
	
	
	public void insurance(byte age, String userId) {
		if(age==dataBaseAge && userId==dataBaseUserId) {
			System.out.println("print all the isurance info stored in the database");
		}else{
			System.out.println("Access Denied");
		}
	}
	
}
