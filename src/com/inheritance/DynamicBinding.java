package com.inheritance;

public class DynamicBinding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal d = new Dog();  ///////////////Initialize parent class
		
		///Reference Variable d refers to object of child class Dog.. as the object is determined at run-time , 
		//Parent Class method eat and child class method eating will be invoked
		d.eat();
		d.eating();
	}
}