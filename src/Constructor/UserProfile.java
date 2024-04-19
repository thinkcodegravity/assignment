package Constructor;

public class UserProfile {
public String userId = "Tahmina";
public String Password = "1234";
public String Email ="a@a.com";
public int phone = 1234344425;

public UserProfile(String u, String pass) {
	userId = u;
	Password = pass;
}
public UserProfile(int pho, String pass) {
	phone = pho;
	Password = pass;
}
public UserProfile(String u, int pho, String pass) {
	userId = u;
	phone = pho;
	Password = pass;
}

}
