package diceGame;

import java.util.Random;

public class Dice {
	
	private Random rn;
	
	public Dice() {
		rn = new Random();
	}
	
	public int roll() {
		return rn.nextInt(6) + 1;
	}
	
	public String graphicDice(int value) {
		switch (value) {
		case 1:
			return "-----\n" +
			       "|   |\n" +
			       "| * |\n" +
			       "|   |\n" +
			       "-----\n";
		case 2:
			return "-----\n" +
			       "|*  |\n" +
			       "|   |\n" +
			       "|  *|\n" +
			       "-----\n";
		case 3:
			return "-----\n" +
			       "|*  |\n" +
			       "| * |\n" +
			       "|  *|\n" +
			       "-----\n";
		case 4:
			return "-----\n" +
			       "|* *|\n" +
			       "|   |\n" +
			       "|* *|\n" +
			       "-----\n";
		case 5:
			return "-----\n" +
			       "|* *|\n" +
			       "| * |\n" +
			       "|* *|\n" +
			       "-----\n";
		case 6:
			return "-----\n" +
			       "|* *|\n" +
			       "|* *|\n" +
			       "|* *|\n" +
			       "-----\n";
		}
		return "";
	}
}
