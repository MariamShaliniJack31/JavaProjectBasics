package com.java.basics;

public class C3ReverseString {

	public static void main(String[] args) {
		
		String str = "I am taking Selenium Online Training on 03072023";
		String x = "";
		System.out.println(str.length());
		
		for(int i = str.length()-1 ; i >= 0; i--) {
			x = x + str.charAt(i);
		}
		System.out.println(x);
		
		String[] str2 = str.split("\\ ");  //Delimiter is space here... WE CAN GIVE \\s
		for (String  s : str2)
			System.out.println(s);
		
		String[] str3 = str.split("\\d");  //Delimiter is Digit here
		for (String  s : str3)
			System.out.println(s);
		
		/////////////StringBuffer
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf.reverse()) ;
		
		/////////////StringBuilder
		StringBuilder sbd = new StringBuilder(str);
		System.out.println(sbd.reverse());
	}
}