/**
 * The controller for handling 
 * the interaction with the UI
 * object and subsequently 
 * updating the entity object
 * This keeps the MVC separation 
 * between these two types
 * @author Partha Roop
 */

import java.util.*;
public class ProblemHandler{
	
	/**
	 * The run method reads the data from the 
	 * UI object. Then populates this data 
	 * in the entity object.
	 * Passes the entity object to a solver 
	 * to perform the desired calculation
	 * @param scan is a Scanner
	 */
	public void run(Scanner scan){
		BinaryArithmeticUI ui = new 
				BinaryArithmeticUI();
		ui.readInput(scan);
		
		ArithmeticProblem problem = 
				new ArithmeticProblem(ui.getL(), ui.getR(), ui.getOp());
		
		ArithmeticSolver solver = new ArithmeticSolver();
		solver.solve(problem);
		if(problem.getStatus()){
			String answer = problem.print();
			ui.printLine(answer);
		}
	}
}