package control_flow;
/*
 	Write a method that takes number as input using while loop
	Print multiple of 1 to 10 for this input

 */
public class MultiplicationTable {
	
	/*
	public void multiple(int number) {
		
	for(int i=1; i<=10; i++){
		if(i%number==0){
			System.out.print(i+" ");
		}
	}
	}
	*/
	
	public void multiple(int number) {
		for(int i =1; i<=10; i++) {
			System.out.println(number + "X" + i + " = " + number * i);
		}
		
	}

}



