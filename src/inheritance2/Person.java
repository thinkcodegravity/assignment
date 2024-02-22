package inheritance2;

public class Person {
	
	String name1  ="John";
	String name2 = "Jane";
	
	int age1 = 25;
	int age2 = 30;
	
	public void taskJohnParent() {
		
		System.out.println("Person name is "+name1);
		System.out.println(name1+" is "+age1+" years old.");
		
		System.out.println(name1+" walks");
		System.out.println(name1+" talks");
		
	}
		
		public void taskJaneParent() {
			
			System.out.println("Person name is "+name2);
			System.out.println(name2+" is "+age2+" years old.");
			
			System.out.println(name2+" walks");
			System.out.println(name2+" talks");
		
		
	}
}
