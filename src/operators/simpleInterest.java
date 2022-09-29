package operators;

public class  simpleInterest {
	
	//I= PTR/100
	
	int P;
	int T;
	int R;
	
	public int interest( int P, int T, int R)  {
		
		int interest = P*T*R/100;
		
		return interest;
	}

}
