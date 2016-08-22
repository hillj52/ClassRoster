package diceGame;

public class Bankroll {
	
	private int cash;
	private int maxOdds;
	private int passLineBet;
	private int odds;
	
	public Bankroll(int cash, int maxOdds) {
		this.cash = cash;
		if (maxOdds > 0) {
			this.maxOdds = maxOdds;
		} else {
			maxOdds = 1;
		}
		passLineBet = 0;
		odds = 0;
	}
	
	public int getCash() {
		return cash;
	}
	
	public boolean placePassLineBet(int bet) {
		if (bet > cash || bet <= 0) {
			return false;
		} else {
			cash -= bet;
			passLineBet = bet;
		}
		return true;
	}
	
	public boolean placeOddsBet(int bet, int point) {
		if (bet > cash || bet < 0) {
			return false;
		} else {
			if (point == 4 || point == 10 || point == 11) {
				cash -= bet;
				odds = bet;
			} else if (point == 5 || point == 9) {
				if ((bet%2) == 0) {
					cash -= bet;
					odds = bet;
				} else {
					return false;
				}
			} else if (point == 6 || point == 8){
				if ((bet%5) == 0) {
					cash -= bet;
					odds = bet;
				} else {
					return false;
				}
			}
		}
		return true;
	}
	
	public void winner(int roll) {
		if (roll == 7) {
			cash += (2*passLineBet);
		} else if (roll == 4 || roll == 10) {
			cash += (2*passLineBet);
			cash += (3*odds);
		} else if (roll == 5 || roll == 9) {
			cash += (2*passLineBet);
			cash += (2.5*odds);
		} else if (roll == 6 || roll == 8) {
			cash += (2*passLineBet);
			cash += (6*(odds/5)+odds);
		} else if (roll == 11) {
			cash += (2*passLineBet);
			cash += (4*odds);
		}
		passLineBet = 0;
		odds = 0;
	}
	
	public void out() {
		passLineBet = 0;
		odds = 0;
	}
	
	public String toString() {
		return "Cash: " + cash;
	}
}
