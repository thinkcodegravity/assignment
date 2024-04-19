package OOPFundamentals;

public class OOPMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.buy("Sun chips");
		p.sell(20);
		p.quantity(2);
		
		Car c = new Car();
		c.driving();
		c.start();
		c.changegear();
		c.stop();
		c.reverse();
		
		Bank b = new Bank();
		b.deposit();
		b.withdraw();
		b.transfer();
		
		Television t = new Television();
		t.changeChannel();
		t.turnonoff();
		t.increaseVolume();
		
		Fan f = new Fan();
		f.air_cooling_system();
		f.filter_air();
		
		Tree tree = new Tree();
		tree.produce_oxygen();
		tree.gives_flower();
		tree.gives_fruit();

	}

}
