package com.Polymorphism;

public class Splender extends Bike {

	static int speedlimit = 150;
	void run(){	
		System.out.println("Child Class run Method............running safely with 60km");	
	}  

	public static void main(String args[])	{  
		Bike b = new Splender();		//upcasting  
		b.run();  
		
		//Since we are accessing the datamember which is not overridden, hence it will access the datamember of Parent class always.
		System.out.println(b.speedlimit); 
		
		Splender s = new Splender();
		System.out.println(s.speedlimit);
		System.out.println(speedlimit);
		
	}  
}