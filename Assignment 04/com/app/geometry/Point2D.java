
package com.app.geometry;
import java.util.*;

public class Point2D {
	double x;
	double y;
	public Point2D(double x1, double y1) {
		
		this.x = x1;
		this.y = y1;
	}
	
	

	public double getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getDetails() {
		
		return "X Coordinate is: "+getX()+" Y Coordinate is: "+getY();
	
		
	}
	public boolean isEqual(Point2D p1) {
		if(this.x==p1.getX() && this.y==p1.getX()) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		
		
		
	}


	
	
	
	public double calculateDistance(Point2D p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }


	
	
	
	
}
