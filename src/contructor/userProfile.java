package contructor;

/*Write a program for UserProfile
	UserProfile has-a userid,password,email,phone
	Can construct Userprofile
	By userid and password
	By email and password
	By phone and password 
 */
public class userProfile {
	String userid = "Yadav23";
	String password = "Computer12@";
	String email = "yadav12@gmail.com";
	long phone = 7894561230l;

	public userProfile(String us, String pas) {

		userid = us;
		password = pas;
	}

	public userProfile(String em, String pas) {
		email = em;
		password = pas;
	}

	public userProfile(long ph, String pas) {

		phone = ph;
		password = pas;
	}

}
