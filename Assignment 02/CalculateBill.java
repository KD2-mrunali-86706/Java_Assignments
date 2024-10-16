import java.util.*;
// 
//Q2. Display food menu to user. User will select items from menu along with the quantity. (eg 1. 
//Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices) 
//When user enters 'Generate Bill' option , display total bill & exit. 
//(No need of any class, and no need to display the food details. Only display the total of orderd 
//food)
public class CalculateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice;
		int quantity=0;
		int amount=0;
		int total=0;
		
		
		do {
			
			System.out.println("1.Dosa");
			System.out.println("2.Idli");
			System.out.println("3.Uttpam");
			System.out.println("4.Tea");
			System.out.println("5.Coffee");
			System.out.println("6.Generate Bill");
			
			
			System.out.println("Enter choice : ");
			 choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("1.Dosa");
			System.out.println("Enter quantity of dosa");
			 quantity=sc.nextInt();
			 amount=15;
		 total=total+amount*quantity;
		 
			
			break;
		case 2:
			System.out.println("2.Idli");
			System.out.println("Enter quantity of Idli");
			 quantity=sc.nextInt();
			 amount=20;
			 total=total+amount*quantity;
			
			break;
		case 3:
			System.out.println("3.Uttpam");
			System.out.println("Enter quantity of utappam");
			 quantity=sc.nextInt();
			 amount=30;
			 total=total+amount*quantity;
			break;
		case 4:
			System.out.println("4.Samosa");
			System.out.println("Enter quantity of samosa");
			 quantity=sc.nextInt();
			 amount=25;
			 total=amount*quantity;
			
			break;
		case 5:
			System.out.println("5.Coffee");
			System.out.println("Enter quantity of coffee");
			 quantity=sc.nextInt();
			 amount=50;
			 total=total+amount*quantity;
			
			break;
		case 6:
			System.out.println("Total Bill is :"+total);
		    break;
		default :
			System.out.println("wrong choice");
		}
		
	}while(choice!=5);
	}
	

}
