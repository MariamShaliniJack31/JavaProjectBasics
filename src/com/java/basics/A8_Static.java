package com.java.basics;

public class A8_Static {

	static int cube(int x){  
		return x*x*x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = A8_Static.cube(5);  /////////////Here we called static method cube using class name A8_Static
		System.out.println(result);  
	}
}