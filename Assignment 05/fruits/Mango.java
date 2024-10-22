package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruit {
	
	
	
	@Override
	public void accept(Scanner sc) {
		
		super.accept(sc);
	}

	public Mango() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, true);
		// TODO Auto-generated constructor stub
	}
	
	

	public Mango(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}
	

}
