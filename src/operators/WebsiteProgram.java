package operators;

public class WebsiteProgram {
//	Has-A 
	
String existingUserid ;

 //Does-A

public boolean logIn(String newRegisterationId,String loginPassword) {
	if(existingUserid==newRegisterationId){
		return true;
	}else {
		return false;
	}
}
}