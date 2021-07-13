/**
 *This is the entity class, which maintains 
 *all persistent data needed by the application.
 *@author Partha Roop
 */

public class Problem{
	private int leftTerm;
	private int rightTerm;
	private float answer;
	private char operator;
	private Boolean isSolved;
	
	Problem(){isSolved=false;}
		//getter methods
		public int getLeft(){
			return leftTerm;
		}
		public int getRight(){
			return rightTerm;
		}
		//getter methods
		public char getOp(){
			return operator;
		}
		public float getAns(){
			return answer;
		}
		public Boolean getStatus(){
			return isSolved;
		}
		//Setter methods
		public void setLeft(int left){
			leftTerm=left;
		}
		
		public void setRight(int right){
			rightTerm=right;
		}
		
		public void setOp(char op){
			operator=op;
		}
		
		public void setAns(float ans){
			answer=ans;
		}
		
		public void setStatus(Boolean status){
			isSolved=status;
		}
}