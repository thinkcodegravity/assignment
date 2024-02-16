package operators.currency;

public class Currency {
	float american;
	
	public Currency(float dollar){
		this.american =dollar;
	}
	
	public float curr() {
		float change;
		change = american*1.26f;
		return change;
	}
}
