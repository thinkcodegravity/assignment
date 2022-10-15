package inheritance;



public  class Employee extends person {

	double salary = 50000;

	public  static void main(String[] args) {
		
		
		person P = new person();

		System.out.println("Employee talk");
		System.out.println("Employee  walk");
		System.out.println(P.name );
		System.out.println(P.age);
		
		System.out.println("Salary "+ salary);
	}
}
