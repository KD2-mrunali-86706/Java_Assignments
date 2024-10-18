import java.util.*;
public class Tester {

	public static void main(String[] args) {
		
		double totalBill=0;
		Invoice I1=new Invoice();
		I1.accept();
		
		Invoice I2=new Invoice();
		I2.accept();
		System.out.println("partNumber"+" "+"Partdescription"+" "+"quantity"+" "+"price");
		I1.display();
		I2.display();
		totalBill+=I1.totalPrice();
		totalBill+=I2.totalPrice();
		System.out.println("total Bill is : "+totalBill);
		
		

	}

}
