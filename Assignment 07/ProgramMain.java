package assignment;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
class StudentSortOnCity implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return (o1.getCity().compareTo(o2.getCity()));
	}
	
}
class StudentSortOnMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return (int) (o2.getMarks()-(o1.getMarks()));
	}
	
}
class StudentSortOnName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return (o1.getName().compareTo(o2.getName()));
	}
	
}
public class ProgramMain {
	
	

	
	
	
	
	public static int menu(Scanner sc) {
		System.out.println("0.Exit");
		System.out.println("1. sorted on their city (asc)");
		System.out.println("2. sorted on their on marks (desc) ");
		System.out.println("3. sorted on their on name (asc) ");
		System.out.println("4. sorted on the rollno ");
		
		System.out.println("Enter choice");
		return sc.nextInt();
		
	}
	public static void displayAllStudent(Student[] arr) {
		System.out.println("*************************");
		for (Student student : arr)
			System.out.println(student);
		System.out.println("*************************");
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
  Student[] s=new Student[4];
  Comparator<Student> comaparator;
  s[0]= new Student(1,"shivu","pune",95);
  s[1]= new Student(50,"ashish","nagpur",45);
  s[2]= new Student(36,"shweta","mumbai",85);
  s[3]= new Student(10,"snehal","kard",32);
  
  displayAllStudent(s);
  int choice;
  while((choice=menu(sc))!=0) {
	  switch(choice) {
	  case 1:
		  

		  
		  comaparator=new StudentSortOnCity();
		  Arrays.sort(s,comaparator);
		  displayAllStudent(s);
		  break;
	  case 2:
		  comaparator=new StudentSortOnMarks();
		  Arrays.sort(s,comaparator);
		  displayAllStudent(s);
		  break;
	  case 3:
		  comaparator=new StudentSortOnName();
		  Arrays.sort(s,comaparator);
		  displayAllStudent(s);
		  break;
	  case 4:
		    Arrays.sort(s);
		    for(Student s1:s) {
				System.out.println("after sorting : "+s1);
			}
			
		  break;
		  
	 default :
		 System.out.println("wrong choice");
		  
		  
	  }
  }
 
 
		
		
		
		
		

	}

}
