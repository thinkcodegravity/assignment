package InheritanceHomework;

public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Assignment number 2: write a sub class for son
		Son s = new Son();
		s.occupation();
		s.Car();
		s.Study();
		
		//Assignment number 3: write a class for company
		Company c1 = new Company("XYZ");
		Company c2 = new Company("Social Security","Provide Security people for other organization");
		Company c3 = new Company("MLM","Business","Dhaka");
		
	}
}
