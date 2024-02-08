package method;

public class SimpleInterest {
	// Create a method that can calculate simple interest
	public float interest(float principal, float time, float rate) {
		float i;
		i = (float)(principal*time*rate)/100;
		return i;
	}
}
