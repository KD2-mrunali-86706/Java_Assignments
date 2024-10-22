package com.app.fruits;
import java.util.*;

public class FruitBasket {
	public static int menu(Scanner sc) {
		
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display names of all fruits in basket");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale ");
		System.out.println("8. Mark all sour fruits stale ");
		System.out.println("Enter choice: ");
		return sc.nextInt();
		
	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		
		Fruit[] basket=new Fruit[size];//array of refrence can we call 
		int counter=0;
		int choice;
		while((choice=menu(sc))!=0) {
			switch(choice) 
			{
			 
			case 0:
				    System.exit(0);
				    break;
			case 1:
				System.out.println("Add Mango-----------");
				if(counter<size) {
					
			    System.out.println("Enter fruit name :");
				String name=sc.next();
				System.out.println("Enter fruit color :");
				String color=sc.next();				System.out.println("Enter fruit weight :");
				double weight=sc.nextDouble();
				
				basket[counter]=new Mango(color,weight,name);
					
					
				
				counter++;
				
				
				
				}
				
				break;
				
			case 2:
				System.out.println("Add Orange-----------");
				if(counter<size) {
					
					
					System.out.println("Enter fruit name :");
					String name=sc.next();
					System.out.println("Enter fruit color :");
					String color=sc.next();
					System.out.println("Enter fruit weight :");
				double weight=sc.nextDouble();
				basket[counter]=new Orange(color,weight,name);
					
					
					
					
					counter++;
				}
				break;
				
				
				case 3:
					System.out.println("Add Apple-------------");
					if(counter<size) {
						System.out.println("Enter fruit name :");
						String name=sc.next();
						System.out.println("Enter fruit color :");
						String color=sc.next();
						System.out.println("Enter fruit weight :");
						double weight=sc.nextDouble();
						basket[counter]=new Mango(color,weight,name);
						
					
						counter++;
					}
					
					break;
				
                case 4:
                	
                	for(int i=0;i<size;i++) {
                		if(basket[i]!=null) {
                			System.out.println(basket[i].getName());
                		}
                	}
                	
                	

                	
                	
					
					break;

                case 5:
                	
              	for(Fruit fruit:basket) {
              		if(fruit!=null) {
              			System.out.println(fruit.toString());
            		
                	}
             	}
					
					break;

                case 6:
                	
                	System.out.println("taste of all stale fruit");
                	for(Fruit fruit:basket) {
                		if(fruit!=null && !fruit.isFresh)
                		{
                			System.out.println(fruit.getName()+" "+fruit.taste());
                		}
                	}
					
					break;
				

                case 7:
                	
                	System.out.println("Enter index");
                	int index=sc.nextInt();
                	if(index>=0 && index<counter && basket[index]!=null) {
                		basket[index].setfresh(false);
                		System.out.println(" mark it stale ");
                	}
					
					break;
				

					
					
					
                case 8:
					for(Fruit fruit:basket) {
						if(fruit !=null && fruit.taste().equals("sour")) {
							fruit.setfresh(false);;
						}
					}
                	
                	
                	
					break;
				
				
				
			default:
					System.out.println("wrong choice");
			
			
			}

			
		}
		
		
		
		

	}

}
