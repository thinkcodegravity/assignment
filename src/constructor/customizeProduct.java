package constructor;

public class customizeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product p1=new product("Pant");
		product p2=new product("Hoddie",10.99);
		System.out.println(p1.nameOfProduct);
		System.out.println(p2.nameOfProduct);
		System.out.println(p2.pricePerUnit);
	}

}
