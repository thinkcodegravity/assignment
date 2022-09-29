package control_flow;
/*
 	Write a method that takes number as input using while loop
	Print multiple of 1 to 10 for this input

 */
public class Question5 {
	
//	public void multiple(int number) {
//		
//		int i = 1;
//		while(i<=10) {
//			if(i % number == 0){
//				System.out.println(i);
//			i++;
//			}
//		}
//			
//		}
	
public void multiple(int number) {
		
	for(int i=1; i<=10; i++){
		if(i%number==0){
			System.out.print(i+" ");
		}
	}
}
}



