/********************************************************
 *This is a boundary class
 *This class is responsible for interacting with 
 *the user to update the entity class based on user input.
 *@author Partha Roop
 *********************************************************/

import java.util.Scanner;


public class DataInput{
	
	/**
	 * The reader for calculation data
	 * @param scan is a Scanner
	 * @param data is of type Problem
	 */
	void readData(Scanner scan, Problem data){
		System.out.print("Enter the left term: ");
		data.setLeft(scan.nextInt());
		System.out.print("Enter the right term: ");
		data.setRight(scan.nextInt());
		System.out.print("Enter the operator: ");
		data.setOp(scan.next().trim().charAt(0));
	}

}