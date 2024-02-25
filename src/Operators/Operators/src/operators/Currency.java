package operators;

public class Currency {
	float americanDollar;
	public Currency(float dollar) {
		this.americanDollar = dollar;
	}
	public float exchange() {
		float ukPound;
		ukPound = americanDollar * 0.79f;
		return ukPound;
		}

}
