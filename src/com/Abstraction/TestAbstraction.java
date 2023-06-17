package com.Abstraction;

public class TestAbstraction {

	public static void main(String args[]){  
	
		Bike obj = new Honda();  	// Bike Constructor is Invoked when ref variable is created
		obj.run();  				// invokes Honda run method
		obj.changeGear();  			// invokes Bike changeGear method
		System.out.println(obj.speed);	//	Invokes Bike Data Member as Data Members cannot be inherited
	}  
}