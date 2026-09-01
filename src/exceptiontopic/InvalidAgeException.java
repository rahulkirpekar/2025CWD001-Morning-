package exceptiontopic;

// Custom Exception / User Defined Exceeption




// 1. Checked Exception ( Compiletime Exception)
//public class InvalidAgeException extends Exception

// 2. UnChecked Exception ( Runtime Exception)
public class InvalidAgeException extends RuntimeException
{
	public InvalidAgeException(String msg) 
	{
		super(msg);
	}
}
