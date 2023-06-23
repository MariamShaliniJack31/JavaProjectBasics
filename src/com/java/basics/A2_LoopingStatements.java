package com.java.basics;

public class A2_LoopingStatements {

	public static void main(String[] args) {
		
		// Simple for loop statement
		int sum = 0;  
		for(int j = 1; j <= 10; j++) {  
			sum = sum + j;  
		}  
		System.out.println("The sum of first 10 natural numbers is " + sum); 
		
		//Java for-each loop. Java provides an enhanced for loop to traverse the data structures like array or collection. 
		// It works on the basis of elements and not the index
		//In the for-each loop, we don't need to update the loop variable. The syntax to use the for-each loop in java is given below.
		String[] names = {"Java","C","C++","Python","JavaScript"};    
		System.out.println("\nPrinting the content of the array names : ");    
		for(String name : names)     
			System.out.println(name);   
		
		// while loop
		int i = 0;    
		System.out.println("\nPrinting the list of first 10 even numbers");    
		while(i <= 10) {    
			System.out.println(i);    
			i = i + 2;    
		}    
		
		// do ..while loop
		i = 12;    
		System.out.println("\nPrinting the list of first 10 even numbers using DO WHILE LOOP");    
		do {    
			System.out.println(i);    
			i = i + 2;    
		}	while(i <= 10);    
		
	}
}