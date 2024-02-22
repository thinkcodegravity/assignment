package inheritance2;

public class JaneDeveloper extends EmployeeJane {
	
	String johnJobTitle = "Developer";
	
	public void taskJaneGrandChild() {
	
		super.taskJaneChild();
		
		System.out.println(name1+" works as a "+johnJobTitle);
	}


}
