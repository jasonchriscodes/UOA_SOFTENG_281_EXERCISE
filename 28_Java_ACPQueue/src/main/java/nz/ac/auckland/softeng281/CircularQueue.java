package nz.ac.auckland.softeng281;

public class CircularQueue extends Queue {

	public CircularQueue(int s) {
		super(s);
	}

	@Override
	public void enqueue(int val) throws QueueFullException {
		if (count == size) {
			throw new QueueFullException("Queue is full");
		}
		data[rear] = val;
		rear = (rear + 1) % size;
		count++;

	}

	@Override
	public int dequeue() throws QueueEmptyException {
		if (count == 0) {
			throw new QueueEmptyException("Queue is empty");
		}
		int val = data[front];
		front = (front + 1) % size;
		count--;
		return val;
	}
}