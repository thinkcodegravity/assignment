package InheritancePersonScenario;

public class App {
	public static void main(String[] args) {
		Person person = new Person();
		person.talk();
		person.walk();

		Developer developer = new Developer();
		developer.work();
		developer.talk();

		Tester tester = new Tester();
		tester.work();
		tester.walk();

		Person p = new Tester();
		p.walk();

	}

}
