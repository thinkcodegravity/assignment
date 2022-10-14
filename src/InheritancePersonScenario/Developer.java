package InheritancePersonScenario;

public class Developer extends employee {

	public Developer() {

	}

	public Developer(String name, int age, double salary, String jobTitle) {
		super(name, age, salary, jobTitle);

	}

	public void work() {
		System.out.println("A software developer writes codes, and fix bugs");
	}

}
