package nz.ac.auckland.softeng281;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;


public class MaxNumbersTest {

	private MaxNumbers maxNumbers;

	@Before
	public void setup(){
		maxNumbers = new MaxNumbers();
	}
	
	@Test(expected=CannotComputeTheMaximumListEmpty.class)
	public void test_getMax_listEmpty_ShouldThrowException(){
		int max = maxNumbers.getMax();
	}
	
	@Test
	public void test_getMax_addDescreasingOrderNumbers_ShouldReturnLargestOne() {
		assertTrue(maxNumbers.addNumber(5));
		assertTrue(maxNumbers.addNumber(4));
		assertTrue(maxNumbers.addNumber(2));
		assertEquals(5, maxNumbers.getMax());
	}
	

	@Test
	public void test_getMax_addIncreasingOrderNumbers_ShouldReturnLargestOne() {
		assertTrue(maxNumbers.addNumber(2));
		assertTrue(maxNumbers.addNumber(4));
		assertTrue(maxNumbers.addNumber(5));
		assertEquals(5, maxNumbers.getMax());
	}
	
	@Test
	public void test_addNumber_addTwoDifferentNumbers_BothShouldBeAdded() {
		assertTrue(maxNumbers.addNumber(5));
		assertTrue(maxNumbers.addNumber(3));
		assertEquals(5, maxNumbers.getMax());
	}
	
	@Test(timeout = 1000)
	public void test_shouldBeFast_waitingForItToFinish_ShouldntTakeLong() {
		int result = maxNumbers.shouldBeFast();
		assertEquals(8, result);
	}
	
	@Test
	public void test_addNumber_addSameNumberTwice_OnlyOneShouldBeAdded() {
		assertTrue(maxNumbers.addNumber(5));
		assertFalse(maxNumbers.addNumber(5));
		
		List<Integer> numbers = maxNumbers.getNumbers();
		assertEquals(1, numbers.size());
	}
}