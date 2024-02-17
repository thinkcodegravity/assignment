package controlflow.menuitem;

public class MenuItem {
	int itemNo;
	int pizzaPrice = 10;
	int pastaPrice =12;
	public MenuItem(int itemNo) {
		this.itemNo =itemNo;
	}
	public void menuPrice() {
		switch(itemNo) {
		case 1:
			System.out.println("$"+pizzaPrice);
			break;
		case 2:
			System.out.println("$"+pastaPrice);
			break;
		default:
			System.out.println("Invalid Menu Item");
			break;
		}
	}
}
