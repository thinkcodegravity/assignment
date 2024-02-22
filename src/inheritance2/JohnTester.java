package inheritance2;

public class JohnTester extends EmployeeJohn {
	
	String johnJobTitle = "Tester";
	
	public void taskJohnGrandChild() {
	
		super.taskJohnChild();
		
		System.out.println(name1+" works as a "+johnJobTitle);
	}

}
