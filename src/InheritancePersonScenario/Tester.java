package InheritancePersonScenario;

public class Tester extends employee {

	public Tester() {

	}

	public Tester(String name, int age, double salary, String jobTitle) {
		super(name, age, salary, jobTitle);

	}

	public void work() {
		System.out.println("The tester usually test programs and find bugs");
	}

}
