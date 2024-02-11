package operators.product;

public class Prodcut {
	float productPrice;
    float discount;
	public Prodcut(float productPrice,float discount) {
		this.productPrice =productPrice;
		this.discount =discount;
	}
	public float discountedPrice() {
		return productPrice-(discount*productPrice);
	}
}
