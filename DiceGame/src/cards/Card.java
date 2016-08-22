package cards;

public class Card {
	
	private int value;//11 = jack, 12 = queen, 13 = king, 14 = ace
	private int suit; //0 = hearts, 1 = clubs, 2 = diamonds, 3 = spades
	
	public Card(int value, int suit) {
		if(validValue(value)) this.value = value;
		if(validSuit(suit)) this.suit = suit;
	}
	
	private boolean validValue(int value) {
		return (value > 1 && value < 15);
	}
	
	private boolean validSuit(int suit) {
		return (suit >= 0 && suit <4);
	}
	
	public int getValue() {
		if (value <= 10)
			return value;
		else if (value < 14)
			return 10;
		else return 11;
	}
	
	public String getSuit() {
		switch (suit) {
		case 0:
			return "Hearts";
		case 1:
			return "Clubs";
		case 2:
			return "Diamonds";
		case 3:
			return "Spades";
		}
		return "";
	}
	
	public String toString() {
		String sb = "";
		switch (value) {
			case 11:
				sb += "J";
				break;
			case 12:
				sb += "Q";
				break;
			case 13:
				sb += "K";
				break;
			case 14:
				sb += "A";
				break;
			default:
				sb += value;				
		}
		switch (suit) {
			case 0:
				sb += "(H)";
				break;
			case 1:
				sb += "(C)";
				break;
			case 2:
				sb += "(D)";
				break;
			case 3:
				sb += "(S)";
				break;	
		}
		return sb;
	}
	
}