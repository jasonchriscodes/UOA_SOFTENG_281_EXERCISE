package nz.ac.auckland.softeng281;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sort{
	
	private List<Double> data;
	
	public Sort() {
		data = new ArrayList<>();
	}
	
	public Sort(ArrayList<Double> data) {
		this.data = data;
	}
	
	public void setData(ArrayList<Double> data) {
		this.data=data;
	}
	
	public ArrayList<Double> getData(){
		return (ArrayList<Double>) data;
	}
	
	private void swap(int i, int j) {
		Double temp = data.get(i);
		data.set(i, (Double) data.get(j));
		data.set(j, temp);
	}
	
	public void bubbleSort() {
		for(int i=0; i< data.size(); ++i) {
			for (int j=i+1; j<data.size();++j) {
				if(data.get(i)> data.get(j)) {
					swap(i,j);
				}
			}
			
		}
	}
	
	public void bubbleSortDescending() {
		for(int i=0; i< data.size(); ++i) {
			for (int j=i+1; j<data.size();++j) {
				if(data.get(i)< data.get(j)) {
					swap(i,j);
				}
			}
			
		}
	}
	public boolean equal(ArrayList<Double> data){
		if(this.data.size()!=data.size()) {
			return false;
		}
		else {
			for(int i=0;i<data.size();++i) {
				if(this.data.get(i)!=data.get(i)) {
					return false;
				}
			
			}
		}
		return true;
		
	}
	
	public void mergeSort(int first, int last) {
		if(first<last){
			int mid = (first+last)/2;
			
			//System.out.println("Print before every merge: "+"first = "+ first + " last= "+last+" mid= "+mid);
			
			mergeSort(first, mid);
			//System.out.println("Print before every merge");
			//print(first, mid);
			mergeSort(mid+1, last);
			//System.out.println("Print before every merge");
			//print(mid+1, last);
			merge(first,last, mid);
			//System.out.println("Print after every merge: ");
			//print(first, last);
		}
	}
	
	
	public void merge(int first, int last, int mid) {
		

		//You have to complete this method
	    
	    }

	  


	
		
	
	public void print() {
		System.out.println("Printing the list");
		int i=0;
		while(i<data.size()) {
			System.out.println("The value at position "+i+" is :"+data.get(i));
			++i;
		}
		
	}
	
	public void print(int first, int last) {
		System.out.println("Printing the list from "+ first +" to " + last);
		int i=first;
		while(i<last+1) {
			System.out.println("The value at position "+i+" is :"+data.get(i));
			++i;
		}
	}
}