package diceGame;

import java.util.ArrayList;

public class DiceRoller {

	private ArrayList<Integer> rolls;
	private Dice d;
	private int numDice;
	
	public DiceRoller(int numDice) {
		rolls = new ArrayList<Integer>();
		d = new Dice();
		if (numDice > 0) {
			this.numDice = numDice;
		} else {
			this.numDice = 1;
		}
		this.roll();
	}
	
	
	public void roll() {
		rolls.clear();
		for (int i=0;i<numDice;i++){
			rolls.add(d.roll());
		}
	}
		
	public int getRoll(int die) {
		return rolls.get(die);
	}
	
	public int getTotal() {
		int tot = 0;
		for (int i=0;i<numDice;i++) {
			tot += rolls.get(i);
		}
		return tot;
	}
	
	public String toString() {
		String sb = "";
		for (int i=0;i<5;i++) {
			for (int j=0;j<numDice;j++) {
				sb += d.graphicDice(rolls.get(j)).substring(i*6,(i*6)+5);
				sb += " ";
			}
			sb += "\n";
		}
		return sb;
	}
}
