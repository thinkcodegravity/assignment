package Constructor.UserProfile;

//Write a program for UserProfile
//UserProfile has-a userid,password,email,phone
//Can construct Userprofile
//By userid and password
//By email and password
//By phone and password

public class Main {

	public static void main(String[] args) {
		UserProfile user1=new UserProfile("12345harry");
		
		UserProfile user2 =new UserProfile("12345harry","harry@gmail.com","1345654hary");
		
		UserProfile user3=new UserProfile("12345harry","1345654hary");
		
		UserProfile user4 =new UserProfile(123456789,"1345654hary");
		
		System.out.println(user1.userId+"\n"+user2.email+"\n"+user3.passWord+"\n"+user4.phone);
		
		System.out.println(user1.email);//null
	}

}
