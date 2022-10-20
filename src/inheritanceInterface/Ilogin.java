package inheritanceInterface;
	/*Write a program for ILogin interface
	Create abstract methods.
	Register method that return register is success or failure, and takes input userid and password and email
	Login method that return login is success or failure, and takes input userid and password
	Change password method that return change is success or failure, and takes input userid and newpassword
	 * 
	 */

import java.util.Scanner;

public interface Ilogin {
	
  void Register();
 String registerisSuccess();
 String registerFailed();
	 String userid = "Ram";
	 String password="adsc";
	 String email="asd@gmail.com";
	 
 Scanner sc= new Scanner(System.in);
  String userid1= sc.next("Ram");
  String password1= sc.next();
 
  
  public static void main(String [] args) {
	  System.out.println(userid1);
	  System.out.println(password1);
  
  if (userid==userid1 && password==password1)
	  System.out.println("Login successful" );
	 
  else
	  System.out.println("Login Failed");}
	  

  
  

  
  }
  
  
 
	

