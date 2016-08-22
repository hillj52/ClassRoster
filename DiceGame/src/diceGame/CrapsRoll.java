package diceGame;

public class CrapsRoll {

	private Dice d;
	private int roll1;
	private int roll2;
	
	public CrapsRoll() {
		d = new Dice();
	}
	
	public void roll() {
		roll1 = d.roll();
		roll2 = d.roll();
		System.out.println(this);
	}
	
	public int getRoll1() {
		return roll1;
	}
	
	public int getRoll2() {
		return roll2;
	}
	
	public int getTotal() {
		return roll1 + roll2;
	}
	
	public boolean is7() {
		return getTotal()==7;
	}
	
	public boolean isCrap() {
		return (getTotal() == 2 || getTotal() == 3 || getTotal() == 12);
	}
	
	public String toString() {
		String dice1 = d.graphicDice(roll1);
		String dice2 = d.graphicDice(roll2);
		return dice1.substring(0,5) + " " + dice2.substring(0,5) + '\n' +
			   dice1.substring(6,11) + " " + dice2.substring(6,11) + '\n' +
			   dice1.substring(12,17) + " " + dice2.substring(12,17) + '\n' +
			   dice1.substring(18,23) + " " + dice2.substring(18,23) + '\n' +
			   dice1.substring(24,29) + " " + dice2.substring(24,29) + '\n';
	}
}