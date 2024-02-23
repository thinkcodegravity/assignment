package inheritance;

import java.util.HashMap;
import java.util.Map;

public interface ILogin {
	
	public String registration(String userId,String password);
	public String login(String userId,String password);
	public String changePassword(String userId,String password);
	
}
 class Authentication implements ILogin {
	
	 Map<String, String> users =new HashMap<>();
	 
	 public String registration(String userId,String password) {
		if(users.containsKey(userId)) 
		{
			return" UserId already exist";
		}
		else 
		{
			users.put(userId,password);
			return"Successfully registered";
		}
}
	public String login(String userId,String password) {
		if(!users.containsKey(userId)){
			return"failure.UserId not found";
			}
		String userDetails =users.get(userId);
		if(userDetails.equals(password)) {
			return "login sucess";
		}else {
			return"login failed";
		}
	}
	public String changePassword(String userId,String newPassword) {
		if(!users.containsKey(userId)) {
			return "failure, user not found";
		}
		users.put(userId, newPassword);
		return "Success: changed";
	}
	
}
