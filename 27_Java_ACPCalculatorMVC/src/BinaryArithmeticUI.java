/**
 * This is the boundary class 
 * @author Partha Roop
 */

import java.util.*;
public class BinaryArithmeticUI{
	private Integer l, r;
	private String op;
	
	//getter methods needed due to
	//a lack of C++ style ``call by reference''
	/**
	 * This method gets the left term
	 * entered by the user
	 * @return l an Integer
	 */
	public Integer getL(){
		return l;
	}
	
	/**
	 * This method returns the right term
	 * @return r an Integer
	 */
	public Integer getR(){
		return r;
	}
	
	/**
	 * This method returns the operator
	 * @return op which is a String
	 */
	public String getOp(){
		return op;
	}
	
	//setter methods needed due to
	//a lack of C++ style ``call by reference''
	
	/**
	 * sets the left value to that of input
	 * @param left an Integer
	 */
	public void setL(Integer left){
		l = left;
	}
	/**
	 * sets the right value to that of input
	 * @param right an Integer
	 */
	public void setR(Integer right){
		r=right;
	}
	
	/**
	 * sets the op value to that of input
	 * @param operator a String
	 */
	public void setOp(String operator){
		op=operator;
	}
	
	/**
	 * Reads the left, right and operator
	 * and sets the values of the local 
	 * attributes
	 * @param scan a Scanner
	 */
	public void readInput(Scanner scan){
		System.out.print("Enter the left term: ");
		setL(scan.nextInt());
		System.out.print("Enter the right term: ");
		setR(scan.nextInt());
		System.out.print("Enter the operator: ");
		setOp(scan.next());
		System.out.println("lTerm= "+l+"rTerm= "+r+"op= "+op);
	}
	
	/**
	 * prints a String representing the
	 * answer of the calculation
	 * @param inp a String
	 */
	public void printLine(String inp){
		System.out.println(inp);
	}
}