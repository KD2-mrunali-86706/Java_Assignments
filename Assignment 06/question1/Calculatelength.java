package question1;

import java.util.Scanner;

public class Calculatelength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	AcceptString s=new AcceptString();
	try {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1=sc.next();
		s.acceptString(s1);
		System.out.println("length of string is="+s1.length());
		
	}
	catch(ExceptionLineTooLong l) {
		
		l.printStackTrace();
		
		
	}
	
	
	}

}
