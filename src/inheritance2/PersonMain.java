package inheritance2;

public class PersonMain {

	public static void main(String[] args) {
		
		JohnTester jt = new JohnTester();
		jt.taskJohnGrandChild();

		
		System.out.println(jt);
		
		JaneDeveloper jd = new JaneDeveloper();
		jd.taskJaneGrandChild();
		
		System.out.println(jd);
		
		

	}

}
