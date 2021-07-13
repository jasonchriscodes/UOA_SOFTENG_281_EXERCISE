/**
 * This is a controller for performing calculations
 * @author Partha Roop
 */

import java.util.Scanner;

public class ArithmeticSolver{
	/**
	 * This performs the calculations based on
	 * the attributes of the input data (the entity)
	 * @param data, which is an ArithmeticProblem
	 */
	public void solve(ArithmeticProblem data){
		int left = data.getLeft();
		int right = data.getRight();
		String op = data.getOp();
		
		switch(op){
		case "+": data.setAns(data.getLeft()+data.getRight()); break;
		case "-": data.setAns(data.getLeft()-data.getRight());break;
		case "*": data.setAns(data.getLeft()-data.getRight()); break;
		case "/": data.setAns((float) data.getLeft()/data.getRight()); 
			  break;
		}
		data.setStatus(true);
	}
	
	/**
	 * The main program entry point
	 * @param args
	 */
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		ProblemHandler pHandler = new ProblemHandler();
		pHandler.run(scan);
	}
}