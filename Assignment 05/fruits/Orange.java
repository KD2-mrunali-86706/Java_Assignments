package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruit{
	
	
	
	
	

	public Orange() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, true);
		
	}

	public Orange(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}
	
	@Override
	public void accept(Scanner sc) {
		
		super.accept(sc);
	}

}
