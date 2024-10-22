package question1;

public class AcceptString {
	
	String s;
	public void acceptString(String s) throws ExceptionLineTooLong {
		if(s.length()<0 || s.length()>80)
			throw new ExceptionLineTooLong("string is too long");
		this.s=s;
			
	}

}
