import java.util.*;
public class Invoice {

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;
	
	public Invoice() {
		partNumber="";
		partDescription="";
		quantity=0;
		price=0;
		
	}
	
	
	
	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}



	public String getPartNumber() {
		return partNumber;
	}



	public void setPartNumber(String partNumber) {
		
		this.partNumber = partNumber;
	}



	public String getPartDescription() {
		return partDescription;
	}



	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		
		this.price = price;
	}
	
	
public void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter partNumber : ");
	setPartNumber(sc.next());
	System.out.println("Enter partDescription : ");
	setPartDescription(sc.next());
	System.out.println("Enter quantity : ");
	setQuantity(sc.nextInt());
	System.out.println("Enter price : ");
	double p1=sc.nextDouble();
	if(p1<0) {
	price=0;
	}
	else {
		setPrice(p1);
	}
	
	
//	setPrice(sc.nextDouble());
}
	
public void display() {
	System.out.println(getPartNumber()+" "+getPartDescription()+" "+getQuantity()+" "+getPrice());
}


public double totalPrice() {
	double amount;
	amount=getPrice()*getQuantity();
	return amount;
	
}
	
	
	
}
