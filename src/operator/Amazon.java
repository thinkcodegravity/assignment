package operator;

public class Amazon {
	public double stock =150.2;
	
	public void order(double orderQuantity) {
		if(orderQuantity < stock) {
			System.out.println("Approved");
		}else {
			System.out.println("Failed");
		}
	}
	public static void main(String[] args) {
		Amazon obj = new Amazon();
		obj.order(151.2);
	}

}
