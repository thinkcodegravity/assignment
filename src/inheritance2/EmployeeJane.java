package inheritance2;

public class EmployeeJane extends Person {
	
	int salary = 200000;
	
	public void taskJaneChild() {
		
		super.taskJaneParent();
		
		System.out.println(name1+" makes "+salary+" dollars");
	}

}
