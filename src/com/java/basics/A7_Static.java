package com.java.basics;

public class A7_Static {

	static int count = 0;	//will get memory only once and retain its value. If count is not static,O/P is 1 1 1
	int notstatic = 0; 
	
	A7_Static()	{  
		count++;  
		notstatic++;
		System.out.println("Static Variable : " + count);
		System.out.println("Non-Static Variable : " + notstatic);
	}  
	  
	public static void main(String args[]){  
		A7_Static c1 = new A7_Static();  
		A7_Static c2 = new A7_Static();  
		A7_Static c3 = new A7_Static();  
	} 
}