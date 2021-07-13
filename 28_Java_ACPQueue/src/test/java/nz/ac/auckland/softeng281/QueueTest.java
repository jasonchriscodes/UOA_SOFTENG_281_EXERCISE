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
	
	@Test
	public void testDequeue() {
		try {
			q.enqueue(10);
			q.enqueue(20);
			q.enqueue(30);
			q.dequeue();
			assertTrue("The size is correct", q.getCount() == 2);
		} catch (QueueFullException e ) {
			
		} 
		catch(QueueEmptyException e)
		{
			fail();
		}
	}
	
	@Test
	public void testDequeueEmpty() {
		try {
			q.enqueue(10);
			q.dequeue();
			q.dequeue();
			fail();
			//assertTrue("The size is correct", q.getCount() == 0);
		} catch (QueueFullException e ) {
			fail();
			
		} 
		catch(QueueEmptyException e)
		{
			
		}
	}
	
	@Test
	public void testPeek() {
		try {
				q.enqueue(10);
				q.enqueue(20);
				q.enqueue(30);
				q.enqueue(40);
				q.enqueue(50);
				
				assertTrue("The values is correct at 0", q.peek(0) == 10);
				assertTrue("The values is correct at 4", q.peek(4) == 50);
		} 
		catch (QueueFullException e) {
			fail();
		} 
		catch(InvalidPositionException e)
		{
			fail();
		}
	}
}