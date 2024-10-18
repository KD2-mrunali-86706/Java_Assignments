package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p=new Point2D(24,24);
		String points=p.getDetails();
		System.out.println(points);
		//System.out.println(p.getDetails());

		Point2D p1=new Point2D(28,29);
		System.out.println(p1.getDetails());


		if(p.isEqual(p1)) {
			System.out.println("coordinates are equal");
		}
		else {
			System.out.println("not equal");
			System.out.println(p.getDetails());
			System.out.println(p1.getDetails());
		}


		Scanner sc=new Scanner(System.in);


		//Accept coordinates for point 1
		System.out.println("Enter coordinates for Point 1 (x1 y1): ");
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();

		// Accept coordinates for point 2
		System.out.println("Enter coordinates for Point 2 (x2 y2): ");
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		// Create two points
		Point2D p3 = new Point2D(x1, y1);
		Point2D p4 = new Point2D(x2, y2);
		double distance=p3.calculateDistance(p4);
		System.out.println("distance is :"+distance);








			}

	}


