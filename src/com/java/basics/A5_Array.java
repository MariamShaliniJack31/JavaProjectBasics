package com.java.basics;

public class A5_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {22, 36, 49, 65, 78, };//declaration, instantiation and initialization  
		//printing array  
		for(int i=0; i<a.length; i++)//length is the property of array  
			System.out.println(a[i]);  
		
		///Declare & Instantiate
		int[] arr = new int[10];
		for(int i=0; i < arr.length; i++) {
			arr[i] = i+2;
			System.out.println(arr[i]); 
		}
		
		////////////for-each loop
		for(int i : arr) {
			System.out.println(i); 
		}
		
		///////Calling the Add Method by Passing Array 
		int res = Addarr(arr);
		System.out.println("The sum is : " +res);
		
		///////Calling the Retarr Method and get the Array
		int[] crr = Retarr();
		for(int i : crr) {
			System.out.println(i); 
		}
	}
	
	//////////////Passing Array to a Method in Java
	public static int Addarr(int[] arr)
	{
		int result = 0;
		for(int i : arr)
			result = result + i;
		
		return result;
	}
	
	///////////////Return Array from a Method
	public static int[] Retarr()
	{
		int[] brr = new int[10];
		for(int i=0; i < brr.length; i++)
			brr[i] = i+5;
		
		return brr;
	}
	
}