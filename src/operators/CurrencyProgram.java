package operators;

public class CurrencyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyProgram cur=new CurrencyProgram();
		double result= cur.dollarToPound(5.5);
		System.out.println(result);
	}
	
	
	public double dollarToPound(double dollar) {
		double pound=dollar*0.79;
		return pound;
	}

}
