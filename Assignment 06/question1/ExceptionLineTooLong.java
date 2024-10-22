/*Q1. Define a new exception, called ExceptionLineTooLong, that prints out the error message "The 
strings is too long". Write a program that reads a String from user and calculates its length.  and 
throws an exception of type ExceptionLineTooLong in the case where a string of length is more 
than 80 characters. 
(Hint- Use String class length() method)*/




package question1;
import java.util.*;
public class ExceptionLineTooLong extends Exception{

	public ExceptionLineTooLong() {}
	
	
	public ExceptionLineTooLong(String message) {
		super(message);
		
	}
	
	
	
}
