package variableScope;
//Calculating simple interest with P T R as input and return simple interest.
	//		Include local variable that can calculate PTR/100.
	
public class SimpleInterestCalc {
	
	public float interest(int p, int t,int r) {
		//delclaration of local variable
		float i;
		int numerator,denominator;
		denominator= 100;//initialization of local variable
		numerator=p*t*r;//logic
		i=numerator/denominator;//logic
		return i;
	}
	
}
