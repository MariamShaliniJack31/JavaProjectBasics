package com.inheritance;

class StaticBinding {
	
	private void eat() { ///If there is any private, final or static method in a class, there is static binding.
		System.out.println("dog is eating...");
	}  
		  
	public static void main(String args[]) {  
		StaticBinding d1 = new StaticBinding();  
		d1.eat();  
		System.out.println(d1 instanceof StaticBinding);
	}  
}