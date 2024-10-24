/*Q1. Use Arrays.sort() to sort array of Students using Comparator. Write a menu driven code to 
display students 
1. sorted on their city (asc) 
2. sorted on their on marks (desc) 
3. sorted on their on name (asc) 
4. sorted on the rollno (Hint- Use comparable) 
class Student { 
private int roll; 
private String name; 
private String city; 
private double marks; 
}*/

package assignment;

public class Student implements Comparable<Student> {
	
	private int roll_no;
	private String name; 
	private String city; 
	private double marks;
	public Student() {
		
	}
	public Student(int roll_no, String name, String city, double marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}
	
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.roll_no-o.roll_no;
	}
	
	
	
	

}
