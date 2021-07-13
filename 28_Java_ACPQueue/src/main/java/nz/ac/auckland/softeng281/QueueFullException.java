package nz.ac.auckland.softeng281;

public class QueueFullException extends Exception{
	public QueueFullException(String message) {
		super(message);
	}
}