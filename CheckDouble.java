import java.util.*;
public class CheckDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		
		double num1=0,num2=0;
		
//		double num2;
		System.out.println("Enter the number");
		if(sc.hasNextDouble())
		{
			if(sc.hasNextInt())
			{
				System.out.println("enter the double value only");
			}
			else
			{
				num1=sc.nextDouble();
			}
		}
		sc.nextLine();
		System.out.println("Enter second number");
		if(sc.hasNextDouble())
		{
			if(sc.hasNextInt())
			{
				System.out.println("enter the double value only");
			}
			else
			{
				num2=sc.nextDouble();
			}
		}
		//System.out.println(num1+" "+num2);
		
		
		  double avg=num1+num2/2;
		   System.out.println("Avg"+avg);
			
		
		
		
		
		
		
		
	}

}
