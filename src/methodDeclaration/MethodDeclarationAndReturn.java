package methodDeclaration;

public class MethodDeclarationAndReturn {
	
	public int paymnet (int amount) {
		return amount;	
	}
	
	public boolean registration () {
		return true;
	
	}
	public double totalCartValue (int qty, int price) {
		return (qty*price);
		
	}
	public float areaOfRectangle(float length, float width) {
		return(length*width);
		
	}
	public double simpleInterest (int principle, int time, int rate) {
		return (principle*time*rate)/100;
		
	}
	public ElectPlanDetails electricity (int zipcode) {
		ElectPlanDetails elc=new ElectPlanDetails();
		
		return elc;
		
	}
	public InsDetails insurance(short age) {
		InsDetails ins=new InsDetails();
		
		return ins;
		
	}
	public UserPro userProfile(String userid, String password) {
	UserPro usp=new UserPro();
	return usp;
	
	}
		
}
	
	

