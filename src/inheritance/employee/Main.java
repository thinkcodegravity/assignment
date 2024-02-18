package inheritance.employee;

public class Main {

	public static void main(String[] args) {
		 Tester tester = new Tester("John",(byte) 25, 200000, "Software Tester");
		 Developer developer =new Developer("Cena", (byte)32, 3500000, "Software developer");
		tester.walk();
		tester.talk();
		tester.work();
		developer.talk();
		developer.walk();
		developer.devWork();

	}

}
