import java.util.*;
public class PrintBinaryOctalHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int number=sc.nextInt();
String binaryEquivalent=Integer.toBinaryString(number);
String octalEquivalent=Integer.toOctalString(number);
String hexadecimalEquivalent=Integer.toHexString(number);

System.out.println("binary equivalents of " +number+" "+"is "+binaryEquivalent);
System.out.println("octal equivalents of " +number+" "+"is "+octalEquivalent);

System.out.println("hexadecimal equivalents of " +number+" "+"is "+hexadecimalEquivalent);
	}

}
