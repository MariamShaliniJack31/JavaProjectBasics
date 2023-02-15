package com.java.basics;

public class A1_ControlStatements {

	int p ;
	
	public static void main(String[] args) {
		int x = 10;    
		int y = 12;    
		
		// Simple if statement
		if(x+y > 20) {    
			System.out.println("x + y is : " + (x+y) ); 
			System.out.println("x + y is greater than 20");  
		}
		
		/////  if-else statement
		if(x+y < 10) {   
			System.out.println("x + y is : " + (x+y) ); 
			System.out.println("x + y is less than 10");  
		} else {  
			System.out.println("x + y is : " + (x+y) ); 
			System.out.println("x + y is greater than 20");  
		}
		
		////if-else-if ladder:
		String city = "Nellore";  
		if(city == "Meerut") {  
			System.out.println("City is Meerut");  
		} else if (city == "Noida") {  
			System.out.println("City is Noida");  
		} else if(city == "Agra") {  
			System.out.println("City is Agra");  
		} else {  
			System.out.println("City is : " +city);  
		}
		
		//////////////Nested if-statement
		String address = "Nellore, India";    
	    
		if(address.endsWith("India")) {    
			if(address.contains("Meerut")) {    
				System.out.println("Your city is Meerut");    
			} else if(address.contains("Noida")) {    
				System.out.println("Your city is Noida");    
			} else {    
				System.out.println("Your city is : " +address.split(",")[0]);
				
				////////////For each loop
				for (String i : address.split(","))
					System.out.println(i.trim());
				}
		} else {    
			System.out.println("You are not living in India");    
		}    
		
		/////////////////Switch statement. The switch permits only int, string, and Enum type variables to be used.
		int num = 2;  
		switch (num){  
			case 0:  
				System.out.println("Number is 0");  
				break;  
			case 1:  
				System.out.println("Number is 1");  
				break;  
			default:  
				System.out.println("Number is : " +num);  
		}
		
		char ch='D';    
	    switch(ch)  
	    {  
	    case 'a':  case 'e': case 'i': case 'o': case 'u' : case 'A':  case 'E': case 'I': case 'O': case 'U' :   
	            System.out.println("Vowel");  
	            break;  
	        default:   
	            System.out.println("Consonant");  
	    }  
	}
}	