package diceGame;

public class BankrollTester {

	public static void main(String[] args) {
		DiceRoller dr = new DiceRoller(2);
		
		System.out.println(dr);
		dr.roll();
		System.out.println(dr);
		dr.roll();
		System.out.println(dr);
	}

}
