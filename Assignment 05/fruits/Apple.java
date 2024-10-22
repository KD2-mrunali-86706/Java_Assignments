package com.app.fruits;

import java.util.Scanner;

public class Apple  extends Fruit{
	
	
	
	

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, true);
		// TODO Auto-generated constructor stub
	}
	

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}

	
	
	
	@Override
	public void accept(Scanner sc) {
		
		super.accept(sc);
	}

	@Override
	public String taste() {
		
		return "sweet and sour";
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", name=" + name + "]";
	}
	
	
	
	

}
