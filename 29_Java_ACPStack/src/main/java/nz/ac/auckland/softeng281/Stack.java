package nz.ac.auckland.softeng281;

import java.util.*;

public class Stack{
	private int top;
	private int size;
	private List<Double> data;
	
	public Stack() {
		top =0;
		size = 1000;
		data = new ArrayList<>();
	}
	
	public Stack(int s) {
		top =0;
		size = s;
		data = new ArrayList<>();
	}
	
	public int getTop(){
		return top;
	}
	
	public void push(Double val) throws StackFullException{
		//You have to implement this
		
	}
	
	public Double pop() throws StackEmptyException{
		
		return -1.0;
	}
	
	public Double peek() throws StackEmptyException{
		return -1.0;
	}
	
	public void print() {
		System.out.println("Printing the stack contents in LIFO order");
		while(top!=0) {
			System.out.println("Value at "+top+" is: " + data.get(top-1));
			top--;
		}
	}
	
	
}