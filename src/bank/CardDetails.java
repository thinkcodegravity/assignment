package bank;

class CardDetails {
	long cardId;
	String cardName;
	String expiryDate;
	CardType cardType;
	int cvv;
	
	public CardDetails(long cardId, String cardName, String expiryDate, CardType cardType, int cvv) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
		this.expiryDate = expiryDate;
		this.cardType = cardType;
		this.cvv = cvv;
	}	
}