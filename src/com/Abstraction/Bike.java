package com.Abstraction;

abstract class Bike {
	
	//An abstract class can have data member, abstract method, method body, constructor and even main() method.
	//If there is any abstract method in a class, that class must be abstract.
	
	//Data Member
	int speed = 100;
	
  	//Constructor
	Bike()	{
		System.out.println("bike is created");
	}
	
	//Abstract Method
	abstract void run();  		
	
	// Method Body
	void changeGear(){
		System.out.println("gear changed");
	}  
}