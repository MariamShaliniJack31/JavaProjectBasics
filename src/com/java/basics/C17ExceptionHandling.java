package com.java.basics;

public class C17ExceptionHandling {

	public static void main(String[] args) {
		
		int num1, num2;
	    try {
	    	/* We suspect that this block of statement can throw 
	    	 * exception so we handled it by placing these statements
	    	 * inside try and handled the exception in catch block
	    	 */
	    	num1 = 0;
	    	num2 = 62 / num1;
	    	System.out.println(num2);
	    	System.out.println("Hey I'm at the end of try block");
	    }
	    catch (ArithmeticException e) { 
	    	/* This block will only execute if any Arithmetic exception 
	        *occurs in try block
	        */
	    	System.out.println("Arithmetic You should not divide a number by zero : " + e.getMessage());
	    }
	    catch (NumberFormatException n) { 
	    	/* This block will only execute if any Arithmetic exception 
	        *occurs in try block
	        */
	    	System.out.println("NumberFormat You should not divide a number by zero : " + n.getMessage());
	    }
	    catch (Exception e) {
	    	/* This is a generic Exception handler which means it can handle
	        * all the exceptions. This will execute if the exception is not
			* handled by previous catch blocks.
			*/
	    	System.out.println("Exception occurred " + e.getMessage());
	    }
	    finally {
	    	System.out.println("Hey I'm in Finally block");
	    }
	    System.out.println("I'm out of try-catch block in Java.");
	}
}