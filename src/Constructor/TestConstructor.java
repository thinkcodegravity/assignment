package Constructor;

public class TestConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products CustomizedProductForUserOne = new Products("Samsung");
		Products CustomizedProductForUserTwo = new Products("Samsung",200.00);
		
		UserProfile user1 = new UserProfile("Mina","1234");
		UserProfile user2 = new UserProfile(123434545, "1233");
		UserProfile user3 = new UserProfile("Mina Kumari",1244234,"124343");
		
		Payment p1 = new Payment(3131313213213L,"2029-03-11",1234);
		Payment p2 = new Payment(424244,"13232");
		
		MoneyTransfer mt1 = new MoneyTransfer(1313142423423L,334);
		MoneyTransfer mt2 = new MoneyTransfer(4234234,120);
		MoneyTransfer mt3 = new MoneyTransfer("t@t.com",121);

	}

}

