package com.Inheritance;

public class Dog extends Animal	{  
	
	public Dog() {
		System.out.println("I am Child Class...........Dog Constructor");
	}
	
	public void bark() {
		System.out.println("Subclass Dog ....barking...");
	} 
	
	public void eating() {
		System.out.println("Subclass Dog is Eating");
	}
}