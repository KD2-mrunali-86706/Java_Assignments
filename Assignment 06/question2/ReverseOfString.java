package question2;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sunbeam";
		String s1="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
			
		}
		System.out.println("reverse of string is : "+s1);

	}

}
