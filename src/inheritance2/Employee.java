package inheritance2;

public class Employee extends Person {
	
	double salary;
	
	public Employee(String name, int age, double salary){
		super(name, age);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + "]";
	}

	
}
