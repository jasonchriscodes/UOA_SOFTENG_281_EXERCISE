package nz.ac.auckland.softeng281;
import nz.ac.auckland.softeng281.InvalidPositionException;
import nz.ac.auckland.softeng281.QueueEmptyException;
import nz.ac.auckland.softeng281.QueueFullException;

public class Queue {
	protected int[] data;
	protected int size;
	protected int front;
	protected int rear;
	protected int count;

	public Queue(int size) {
		this.size = size;
		front = 0;
		rear = 0;
		count = 0;
		data = new int[size];
	}

	public void enqueue(int val) throws QueueFullException {
		
		if(rear==size) {
			throw new QueueFullException("Queue is full");
		}
		data[rear]=val;
		++rear;
		++count;
	}

	public int dequeue() throws QueueEmptyException {
		
		int out = data[front];
		++front;
		--count;
		return out;
		
	}



	public int peek(int pos) throws InvalidPositionException {
		return 0;
	}

	public int getFront() {
		return front;
	}

	public int getRear() {
		return rear;
	}

	public int getCount() {
		return count;
	}

	public void print() {
		int i = 0;
		if (count == 0) {
			System.out.println("The queue is empty..nothing to print");
		}
		while (i < count) {
			System.out.println("Data at position " + i + " is" + data[i]);
			i++;
		}
	}
}
