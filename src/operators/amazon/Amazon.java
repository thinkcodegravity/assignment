package operators.amazon;

public class Amazon {
	static int noOfStock=100;
	int noOfOrder;
	public Amazon(int order) {
		this.noOfOrder =order;
		}
	public void order() {
		if(noOfOrder<=noOfStock){
			System.out.println("order approved");
		}else {
			System.out.println("cancelled");
		}
	}
}
