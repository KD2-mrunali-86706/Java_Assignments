package question3;

import java.util.Scanner;

public class PalindromeOfString {

	public static void main(String[] args) {
		
		
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string=sc.next();
		
		
		String p="";
		for(int count=string.length()-1;count>=0;count--) {
			p=p+string.charAt(count);
			
		}

		
		if(string.equals(p)) {
			System.out.println("string is palindrome");
		}
		else {
			System.out.println("string is not palindrome");
		}
	}

}
