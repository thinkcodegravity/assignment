package banking;

public class Bank 
{
	//DataType VariableName = Variable value; 
	
		/*
		 primitive/simple data type
		     numeric = byte, long, int
		     fractional number = float, double
		     character = single alphabetic character = char
		     yes/no = true/false = boolean
		 
		 Comples / object data type 
		     group of character = String
		 
		 
		 
		 
		 */
		
	
	/* 
	    = is assignment operator
	    int x = 10; 
	    LHS   = RHS
	    It takes the data/value of RHS and store or assign in LHS variable
	    4) LHS can always be a variable
	    5) RHS can be value or variable
	           RHS if contain variable ... program substitute its value
	    6) RHS always resolves/converts into a single Value
	    
	    7) LHS is always variable and RHS is always single value
	 
	  declaration: Allows program to decide what data can be stored. // String name; 
	  initilization: First value                                     //String name = "ram";
	  Reassignment : change the previous value                       //String name = "hari"; 
	 
	 
	 
	 
	 * 
	 */
		
		String name = "Hari";
		
		
		public static void main(String [] args ) 
		{
			// TODO Auto-generated method stub 
			int abcd = 10;
			int bcde = abcd; 
			
			System.out.println(bcde);
			
			
			abcd = 20;
			String name = "Hari";

			System.out.println(name);
		}


}
