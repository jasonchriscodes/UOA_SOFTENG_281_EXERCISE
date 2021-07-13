package nz.ac.auckland.softeng281;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.util.Random;
public class SortTest{
	Sort s;
	
	@Before
	public void init() {
		
		List<Double> data =  new ArrayList<Double>();
		Random r = new Random();
		for(int i=0; i<5000; ++i) {
			data.add(r.nextDouble());
		}
		s= new Sort();
		s.setData((ArrayList<Double>) data);
		
	}
	
	@After
	public void refresh() {

	}
	
	@Test
	public void testBubbleSort() {
		
		//long start = System.nanoTime();
		long start = System.currentTimeMillis();
		s.bubbleSort();
		long end = System.currentTimeMillis();
		//long end = System.nanoTime();
		System.out.println("Bubble sort time "+ (end-start));
		int i=0;

		while(i<s.getData().size()) {
			if(i+1 < s.getData().size()) {
				assertFalse((s.getData().get(i)>s.getData().get(i+1)));
				++i;
			}
			else {
				++i;
			}
		}
		
		
	}
	
	@Test
	public void testBubbleSortUsingCollectionsSort() {
		ArrayList<Double> first =  s.getData();
		
		Collections.sort(first);
		s.bubbleSort();
		
		if(!s.equal(first)) {
			fail();
		}
		
	
	}
	
	@Test
	public void testMergeSort() {
		
		long start = System.currentTimeMillis();
		//long start = System.nanoTime();
		s.mergeSort(0, s.getData().size()-1);
		//long end = System.nanoTime();
		long end = System.currentTimeMillis();
		System.out.println("Merge sort time "+ (end-start));
		//s.print();
		int i=0;

		while(i<s.getData().size()) {
			if(i+1 < s.getData().size()) {
				assertFalse((s.getData().get(i)>s.getData().get(i+1)));
				++i;
			}
			else {
				++i;
			}
		}
		//System.out.println("End of test Merge Sort");
		
	}
	
	@Test
	public void testMergeSortSortedList() {
		
		s.bubbleSort();
		s.mergeSort(0, s.getData().size()-1);
		
		//s.print();
		int i=0;

		while(i<s.getData().size()) {
			if(i+1 < s.getData().size()) {
				assertFalse((s.getData().get(i)>s.getData().get(i+1)));
				++i;
			}
			else {
				++i;
			}
		}
		//System.out.println("End of test Merge Sort");
		
	}
	
	@Test
	public void testMergeSortSortedListDescending() {
		
		s.bubbleSortDescending();
		s.mergeSort(0, s.getData().size()-1);
		
		//s.print();
		int i=0;

		while(i<s.getData().size()) {
			if(i+1 < s.getData().size()) {
				assertFalse((s.getData().get(i)>s.getData().get(i+1)));
				++i;
			}
			else {
				++i;
			}
		}
		//System.out.println("End of test Merge Sort");
		
	}
	
	@Test
	public void testMerge() {
		List<Double> l = new ArrayList<>();
		l.add(10.5);
		l.add(50.9);
		l.add(67.2);
		l.add(99.679);
		l.add(5.375);
		l.add(15.97);
		l.add(200.67);
		l.add(201.999);
		int first =0;
		int last=7;
		int mid = (first+last)/2;
		System.out.println("mid= "+mid);
		s.setData((ArrayList<Double>)l);
		s.merge(first,last,mid);
		//s.print();
		for(int i=first; i<last;++i) {
			if(l.get(i).equals(l.get(i+1))) {
				fail();
			}
		}
	}
}