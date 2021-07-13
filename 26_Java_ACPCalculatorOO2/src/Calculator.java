/**
 *A first OO design of a simple Calculator
 *Question: what changed wrt the previous design?
 *@author Partha Roop
 */

import java.util.*;

public class Calculator{
	
	//Main method for performing calculation
	/**
	 * Method for performing calculations
	 * @param data which is of type Problem
	 * @param scan which is a Scanner
	 * 
	 */
	public void calculate(Problem data, Scanner scan){
		switch(data.getOp()){
			case '+': data.setAns(data.getLeft()+data.getRight()); break;
			case '-': data.setAns(data.getLeft()-data.getRight());break;
			case '*': data.setAns(data.getLeft()-data.getRight()); break;
			case '/': data.setAns((float) data.getLeft()/data.getRight()); 
				  break;
		}
		data.setStatus(true);
	}
	/**
	 * The main entry point
	 * @param args
	 */
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		DataInput inp = new DataInput();
		Calculator cal = new Calculator();
		Problem data = new Problem();
		inp.readData(scan, data);
		cal.calculate(data, scan);
		
		if(data.getStatus()){
			System.out.println("The result of "+
				data.getLeft()+data.getOp()+data.getRight()+"= "+data.getAns());
		}
		else{
			System.out.println("Problem is yet unsolved.");
		}
	}
}