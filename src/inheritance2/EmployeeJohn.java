package inheritance2;

public class EmployeeJohn extends Person {
	
	int salary = 100000;
	
	public void taskJohnChild() {
		
		super.taskJohnParent();
		
		System.out.println(name1+" makes "+salary+" dollars");
	}

}
