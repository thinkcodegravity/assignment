package control_flows;

public class Registration {
	static String registeredPhone, registeredUserId, registeredPassword;
	public static String getUserId(String phone) {
		if(phone == registeredPhone) {
			return registeredUserId;
		}
		else {
			return "Phone not registered";
		}
	}
	public static String getPassword(String userId) {
		if(userId == registeredUserId){
			return registeredPassword;
		}
		else {
			return "UserId not registered";
		}
	}
}
