package com.Inheritance;

public class Simple extends A{  
	
	//If you are overriding any method, overridden method (i.e. declared in subclass) must not be more restrictive.
	//The default modifier is more restrictive than protected. That is why, there is a compile-time error.
	public void msg() {
		System.out.println("Hello java in Simple");
	}//C.T.Error  
		
	public static void main(String args[]){  
		Simple obj = new Simple();  
		obj.msg();  
	}  
}