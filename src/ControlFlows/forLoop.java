package ControlFlows;

public class forLoop {

	public static void main(String[] args) {
		//Print the multiple of 5 between the 1-10
		//Multiple of 5 is 5*1=5, 5*2=10
		//Multiple of 5 between 1-10 is 5 and 10
		for (int number =1; number<=10; number++) {
			//check if number is multiple of 5
			if(number%5==0 ) {
				System.out.println(number); //multiple of 5 are 5 and 10
			}
		}
	}	
}
