package Assignment3;

public class Father {
String name;
int age;
public Father(String name, int age) {
this.name=name;
this.age=age;
}
public void display() {
	System.out.println("Name:"+name);
	System.out.println("Age:"+age);
}
}
public class Son extends Father{
	public Son(String name, int age) {
	super(name,age);
}
}