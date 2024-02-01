package operators;

public class LoginProgram {

//	Has-A 
	
String registerUserid ;
String registerPassword;

 //Does-A

public boolean logIn(String loginUserid,String loginPassword) {
	if(registerUserid==loginUserid && registerPassword==loginPassword) {
		return true;
	}else {
		return false;
	}
}
}
