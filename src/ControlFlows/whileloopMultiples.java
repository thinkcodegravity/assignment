package ControlFlows;

public class whileloopMultiples {

	public static void main(String[] args) {
		//Multiples of 6 between the 1-10
		//Multiple of 6 is only 6
		int i=1;
		while(i<=10) {
			if(i%6==0) {
				System.out.println("Multiples of six is "+i);	
			}
            i++;
		}
	
	}

}
