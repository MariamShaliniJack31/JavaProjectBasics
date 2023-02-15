package com.oops.basics;

public class A1_Student_ObjectandClass {

	//Defining Fields  
	int id = 85;	//field or data member or instance variable  
	String name = "I am Instance Variable";  
	 
	public static void main(String[] args) {
		 
		//Creating an object or instance  
		A1_Student_ObjectandClass s1 = new A1_Student_ObjectandClass(); //creating an object of Student  
		Student st = new Student(2525, "Initialization through Constructor");
		 
		//Printing values of the object  
		System.out.println("I am Instance Variable id , accessing member through reference variable s1 : " + s1.id);		//accessing member id through reference variable s1  
		System.out.println("I am Instance Variable name, accessing member through reference variable s1 : " + s1.name);
		
		//Initialization through reference variable. st is reference Variable of class Student, we instantiated the Student class in this class and initialized the sname variable
		st.sname = "Shalini";
		System.out.println("I am Instance Variable name in Student Class, accessing member through reference variable s1 : " + st.sname);
		System.out.println(st.sid);
		
		
		////////////Initialization through method... we have initialized in Student Class and passing values here
		st.insertRecord(111,"Karan");
		st.displayInformation();
		st.insertRecord(222,"Aryan");  
		st.displayInformation();  
		}
}