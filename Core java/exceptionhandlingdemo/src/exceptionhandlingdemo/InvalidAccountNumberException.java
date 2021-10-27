package exceptionhandlingdemo;


public class InvalidAccountNumberException extends RuntimeException{
	public InvalidAccountNumberException(String msg) {
		super(msg);
	}
}
