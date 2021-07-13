
/**
 * An entity class for a simple calculator
 * @author Partha Roop
 *
 */
public class ArithmeticProblem{
	private int leftTerm; private int rightTerm; private float answer; 
	private String operator; private Boolean isSolved;
		ArithmeticProblem(Integer l, Integer r, String ch){
			leftTerm=l; rightTerm=r;
			operator=ch; isSolved=false;
		}
		//getter methods
		/**
		 * gets the left term
		 * @return leftTerm, which is an Integer
		 */
		public int getLeft(){
			return leftTerm;
		}
		
		/**
		 * gets the right term
		 * @return rightTerm, which is an Integer
		 */
		public int getRight(){
			return rightTerm;
		}
		
		/**
		 * gets the operator
		 * @return operator, which is a String
		 */
		public String getOp(){
			return operator;
		}
		
		/**
		 * gets the answer
		 * @return answer, which is a float
		 */
		public float getAns(){
			return answer;
		}
		
		/**
		 * gets the status of calculations
		 * @return isSolved, which is a Boolean
		 */
		
		public Boolean getStatus(){
			return isSolved;
		}
		//Setter methods
		
		/**
		 * sets the leftTerm to the value of the input
		 * @param left, which is an Integer
		 */
		public void setLeft(int left){
			leftTerm=left;
		}
		
		/**
		 * sets the rightTerm to the value of the input
		 * @param right is an Integer
		 */
		public void setRight(int right){
			rightTerm=right;
		}
		
		/**
		 * sets operator to the value of the input
		 * @param op is a String
		 */
		public void setOp(String op){
			operator=op;
		}
		
		/**
		 * sets the answer to the value of the input
		 * @param ans is a float
		 */
		public void setAns(float ans){
			answer=ans;
		}
		
		/**
		 * sets the status of calculations to the input
		 * @param status is Boolean
		 */
		public void setStatus(Boolean status){
			isSolved=status;
		}
		
		/**
		 * prints the result of calculation
		 * @return out, which is a String
		 */
		public String print(){
			String out = new String(); out = "The Solution to "+
			leftTerm+operator+rightTerm+" = "
					+answer;
			return out;
		}
}