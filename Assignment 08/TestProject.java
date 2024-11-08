/*1. Add Following Projects in the Set 
2. Input a Project from user and add in Set  
3. Display all Projects in Set  
4. Delete a Project by Id from Set  
5. Copy All Projects from Set to ArrayList  
6. Display all Projects from List  
7. Sort all Projects in List by cost  
8. Find project with Max team size using Collections.max()  
9. Count all Projects of "Java" technology using Stream API */
package p1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class TestProject {
	
	public static int menu(Scanner sc) {
		System.out.println("0. EXIT");
		System.out.println("1. Add Following Projects in the Set");
		System.out.println("2. Input a Project from user and add in Set ");
		System.out.println("3.Display all Projects in Set  ");
		System.out.println("4.Delete a Project by Id from Set  ");
		System.out.println("5.  Copy All Projects from Set to ArrayList  ");
		System.out.println("6. Display all Projects from List");
		System.out.println("7. Sort all Projects in List by cost ");
		System.out.println("8.Find project with Max team size using Collections.max()");
		System.out.println("9. Count all Projects of \"Java\" technology using Stream API");
		
		System.out.print("Enter the choice - ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
//		List<Project> listProject=new ArrayList<Project>();
		 ArrayList<Project> projectList=null;
		HashSet<Project> project=new HashSet<Project>();
		Scanner sc=new Scanner(System.in);
		Project p;
		int choice;
		while((choice=menu(sc))!=0) {
			switch(choice){
			
			case 1:
				
			
			
			project.add(new Project(2, "Airline Reservation System",3, 6000000, ".NET"));
			project.add(new Project(4, "Online Grocery Shop", 6, 3000000, "Java"));
			project.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
			project.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
			project.add(new Project(2, "Bus Reservation System", 3, 3500000, "JS"));
			
			
				System.out.println("--------Add Following Projects in the Set---------");
				
				break;
				
			case 2:
				System.out.println("--------Add  Projects in the Set---------");
				   p=new Project();
				   p.accept(sc);
				   project.add(p);
				break;
				
			case 3:
				System.out.println("--------Display all data---------");
				project.forEach(System.out::println);
				break;
				
			case 4:
				System.out.println("--------delete Following Projects in the Set---------");
				System.out.println("Enter Project id to delete - ");
				System.out.println("Project deleted = " + project.remove(new Project(sc.nextInt())));
				break;
				
			case 5:
//				listProject.addAll(project);
				
				System.out.println("------------Copy All Projects from Set to ArrayList ------------");
				
                 projectList=(ArrayList<Project>) project.stream().collect(Collectors.toList());
//				System.out.println(pl);
				
				break;
				
			case 6:
				
				System.out.println("----------------6. Display all Projects from List------------");
				System.out.println(projectList);
				
			     
				    
				break;
				
			case 7:
				
				     System.out.println("--------------7. Sort all Projects in List by cost -------------");
				     
				     
				     Collections.sort(projectList,(o1,o2)->{
				    	 double diff=o1.projectCost-o2.projectCost;
				    	 return (int) diff;
				     });
				     System.out.println(projectList);
				     
				break;
				
				
			case 8:
				System.out.println("-------8.Find project with Max team size using Collections.max()-------");
				Project pr=new Project();
				pr=Collections.max(projectList, (o1,o2)->{
					int sizeTeamSort=o1.teamSize-o2.teamSize;
					return sizeTeamSort;
				});
				System.out.println(pr);
				
				break;
				
			case 9:
				System.out.println("------------9. Count all Projects of \"Java\" technology using Stream API------------");
				 long javaProjectCount = project.stream()
                         .filter(projects -> "Java".equals(projects.getTechnology()))
                         .count();

                  System.out.println("Number of Java projects: " + javaProjectCount);
						
				break;
				
		default:
					System.out.println("wrong choice");
					
				break;
				
			}
		}
		saveProjects(project);

	}

	private static void saveProjects(HashSet<Project> project) {
		try (FileOutputStream fos = new FileOutputStream("project02.db")) {
			try (BufferedOutputStream bos = new BufferedOutputStream(fos)) {
				try (ObjectOutputStream oos = new ObjectOutputStream(bos)) {
					oos.writeObject(project);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static HashSet<Project> loadProjects() {
		try (FileInputStream fis = new FileInputStream("project02.db")) {
			try (BufferedInputStream bis = new BufferedInputStream(fis)) {
				try (ObjectInputStream ois = new ObjectInputStream(bis)) {
					HashSet<Project> projects =  (HashSet<Project>) ois.readObject();
					return projects;
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	
	}

}
