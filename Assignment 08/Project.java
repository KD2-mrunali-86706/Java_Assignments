
/*Maintain a HashSet of projects and perform given operations in a menu-driven program. 
Ensure that projects are not duplicated by the project id in the set. 
Each project information includes int id, String title, int teamSize, double projectCost , String 
technology. 
All the projects should be stored in the file before the program ends and loaded in the 
collection when program starts.
1. Add Following Projects in the Set 
2. Input a Project from user and add in Set  
3. Display all Projects in Set  
4. Delete a Project by Id from Set  
5. Copy All Projects from Set to ArrayList  
6. Display all Projects from List  
7. Sort all Projects in List by cost  
8. Find project with Max team size using Collections.max()  
9. Count all Projects of "Java" technology using Stream API  */
package p1;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Project implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String title;
	int teamSize;
	double projectCost ;
	String technology;
	public Project() {
		
	}
public Project(int id) {
	this.id=id;
		
	}
	
	public Project(int id, String title, int teamSize, double projectCost, String technology) {
	super();
	this.id = id;
	this.title = title;
	this.teamSize = teamSize;
	this.projectCost = projectCost;
	this.technology = technology;
}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return id == other.id;
	}
	
	
	
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", title=" + title + ", teamSize=" + teamSize + ", projectCost=" + projectCost
				+ ", technology=" + technology + "]";
	}
	public void accept(Scanner sc) {
		System.out.print("Enter the project id - ");
		id = sc.nextInt();
		System.out.print("Enter the project title - ");
		title = sc.next();
		System.out.print("Enter the  teamsize - ");
		teamSize = sc.nextInt();
		System.out.println("Enter projectCost :- ");
		projectCost=sc.nextDouble();
		System.out.println("Enter technology: - ");
		technology=sc.next();
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
