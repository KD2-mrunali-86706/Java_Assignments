package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	String color;
	double weight;
	String name;
	boolean isFresh=true;
	
	
	public Fruit() {
		
	}


	public Fruit(String color, double weight, String name,boolean isFresh) {
		
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh=isFresh;
		
	}


	public abstract  String taste();


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Fruit(String color, double weight, String name) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
	}


	
	
	@Override
	public String toString() {
		return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}


	public void setfresh(boolean isFresh) {
		this.isFresh=isFresh;
	}
	
	
	public void accept(Scanner sc) {
		System.out.println("Enter fruit name :");
		String name=sc.next();
		System.out.println("Enter fruit color :");
		String color=sc.next();
		System.out.println("Enter fruit weight :");
		double weight=sc.nextDouble();
	}
	

}
