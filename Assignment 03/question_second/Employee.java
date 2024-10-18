import java.util.*;
public class Employee {
	private String firstName;
	private String lastname;
	private double monthlySalary;
	
	public Employee()
	{
		firstName="";
		lastname="";
		monthlySalary=0;
		}

	public Employee(String firstName, String lastname, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
public void accept() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the FirstName :");
	setFirstName(sc.next());
	System.out.println("Enter the LastName :");
	setLastname(sc.next());
	System.out.println("Enter monthly Salary");
	double sal=sc.nextDouble();
	if(sal<0) {
		monthlySalary =0;
	}
	else {
		setMonthlySalary(sal);
		
		
	}
	
	
}

public void display() {
	System.out.println(getFirstName()+" "+getLastname()+"    "+getMonthlySalary()+"    "+((getMonthlySalary()*12))+"    "+((getMonthlySalary()*12)+(getMonthlySalary()*12*0.10)));
	
}
	
	
	

}
