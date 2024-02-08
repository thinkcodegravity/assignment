package VariableScope;

public class VariableAge {
	int age=25;  //Class Level variable or global variable

	
	//Local variable exist inside the method body
	
	public void person() {
		this.age=25; //this is global variable
		int age=35;  //this is local variable
	}
}
