package InheritancePersonScenario;

public class employee extends Person {
	public double salary;
	public String jobTitle;

	public employee() {

	}

	public employee(String name, int age, double salary, String jobTitle) {
		super();
		this.salary = salary;
		this.jobTitle = jobTitle;

	}

	public void work() {
		System.out.println("Work for Employeers");
	}

}
