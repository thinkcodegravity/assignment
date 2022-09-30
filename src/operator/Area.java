package operator;

public class Area {
	public float areaOfSq(float side) {
		float AS=(side*side);
		return AS;
		
	}
	public float areaOfcirc(float r) {
		float AC= r*r;
		return AC;
		
	}
	public float areaOfRec(float l, float w) {
		float AR=l*w;
		return AR;
		
	}
	public  float productPr(float price, float dis) {
		float finalAmt=price-(price*dis)/100;
		return finalAmt;
		
	}

}
