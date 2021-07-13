package nz.ac.auckland.softeng281;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	Queue q;

	@Before
	public void init() {

		q = new Queue(5);
	}

	@After
	public void refresh() {
		q = null;
	}

	@Test
	public void testEnqueue() {
		try {
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(40);
			assertTrue("The size is correct", q.getCount() == 3);
		} catch (QueueFullException e) {
			fail();
		} 
	}
	
	@Test
	public void testEnqueueBoundary() {
		try {
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.enqueue(40);
			q.enqueue(50);
			q.enqueue(60);
			assertTrue("The size is correct", q.getCount() == 5);
		} catch (QueueFullException e) {
			
		} 
	}
}