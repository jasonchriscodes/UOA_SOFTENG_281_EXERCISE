package nz.ac.auckland.softeng281;

public class InvalidPositionException extends Exception{
    
    public InvalidPositionException(){}

    public InvalidPositionException(String msg){
    	super(msg);
    }

}