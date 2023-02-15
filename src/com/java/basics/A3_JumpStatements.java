package com.java.basics;

public class A3_JumpStatements {

	public static void main(String[] args) {

		// break statement
		for(int i = 0; i<= 10; i++) {  
			System.out.println(i);  
			if(i == 6) {  
				System.out.println("\n");
				break;  
			}  
		} 
		
		a: for(int i = 0; i<= 10; i++) {    
			b: for(int j = 0; j<=15;j++) {    
				c: for (int k = 0; k<=20; k++) {    
					System.out.println(k);    
					if(k == 5) { 
						System.out.println("\n");
						break a;    
					}    
				}    
			}
		}
		
		//Java continue statement...Unlike break statement, the continue statement doesn't break the loop, whereas, it skips the specific part of the loop
		//and jumps to the next iteration of the loop immediately.
		for(int i = 0; i<= 2; i++) {  
			for (int j = i; j<=5; j++) {  
				if(j == 4) {  
					continue;  
				}  
				System.out.println(j);  
			}  
		}  
	}
}
