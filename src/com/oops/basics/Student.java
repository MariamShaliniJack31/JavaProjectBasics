package com.oops.basics;

public class Student {
	
	int sid;  
	String sname;  
	
	/////// Parameterized Constructor
	Student(int cid, String cname)
	{
		sid = cid;
		sname = cname;
		System.out.println("I am Constructor Student and my values are... " + cid +"       "+cname);
	}
	
	//Initialization through Method
	void insertRecord(int r, String n){  
		sid = r;  
		sname = n;  
	}  
	
	void displayInformation() {
		System.out.println("Initialization through Method : "+sid+" "+sname);  
	}  
}