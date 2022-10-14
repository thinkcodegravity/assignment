package inheritanceAssignment;

public class Developer extends Employee {
	String jobTitle;

	public Developer(String name, int age, double salary, String jobTitle) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.jobTitle = jobTitle;
	}
	
	public static void main(String[] args) {
		Developer d1 = new Developer("Andy", 25, 5000, "Java Developer");
		System.out.println(d1.name + "\n" +  d1.age + "\n" + d1.salary + "\n" + d1.jobTitle);

	}

}
