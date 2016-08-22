package ssa;

public class RPNCalculator {
	
	public static void main(String[] args) {
		char[] problem = new char[] {'2','9','*','3','/','7','+','9','-','2','^'};
			
		/*
		 * RPNStack constructor can 
		 * be called with either
		 * a String or a char[]
		 */
		RPNStack rpn = new RPNStack(problem);
		System.out.println(rpn);
	}
}
