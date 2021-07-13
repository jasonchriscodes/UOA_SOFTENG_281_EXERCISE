package nz.ac.auckland.softeng281;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCircularQueue {
	Queue q;

	@Before
	public void init() {

		q = new CircularQueue(5);
	}

	@After
	public void refresh() {
		q = null;
	}

	// Insert 5 times and then remove 5 times
	// Then insert should fail
	@Test
	public void testFulltoEmptyEnqueue() {
		try {
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(40);
			q.enqueue(50);
			q.enqueue(60);

			assertTrue("The size is correct", q.getCount() == 5);

			assertTrue("Front has correct value", q.dequeue() == 10);
			assertTrue("Front has correct value", q.dequeue() == 20);
			assertTrue("Front has correct value", q.dequeue() == 40);
			assertTrue("Front has correct value", q.dequeue() == 50);
			assertTrue("Front has correct value", q.dequeue() == 60);
			q.enqueue(70);
			q.enqueue(80);
			assertTrue("The size is correct", q.getCount() == 2);
		} catch (QueueFullException e) {
			fail();
		} catch (QueueEmptyException e) {
			fail();
		}
	}
}