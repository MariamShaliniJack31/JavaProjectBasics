package com.java.basics;

public class A4_FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Please find the below programs 
		 * Java Basic Programs
		 * Java Number Programs
		 * Java Array Programs
		 * Java Matrix Programs
		 * Java String Programs
		 * Java Searching and Sorting Programs
		 * Java Conversion Programs
		 * Pattern programs
		 * Singly Linked List Programs
		 * Circular Linked List Programs
		 * Doubly Linked List Programs
		 * Tree Programs
		 */
		int fnum = 0;
		int snum = 1;
		int tnum;
		
		System.out.println(fnum);
		System.out.println(snum);
		for (int i = 0; i <=10 ; i++)
		{
			tnum = fnum + snum;
			fnum = snum;
			snum = tnum;
			System.out.println(tnum);
		}
	}

}
