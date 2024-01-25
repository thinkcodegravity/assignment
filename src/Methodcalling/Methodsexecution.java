package Methodcalling;

public class Methodsexecution {
	  public static void main(String[] args) {
	        System.out.println("helloooo");
	        m1();
	        m2();
	        System.out.println("this is the end");
	    }
	    //Here I have demonstrated how java executes each line of code one after another
	    public static void m1(){
	        System.out.println("calling method 1");
	    }

	    public static void m2(){
	        System.out.println("calling method 2");

	    }
}
