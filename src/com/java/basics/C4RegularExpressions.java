package com.java.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C4RegularExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("\\d");		//https://www.javatpoint.com/java-regex
		//Here d means Any digits, short of [0-9]
		Matcher m = p.matcher("I am in 2017 year and 11th month");
			
		while(m.find())
			System.out.println(m.group(0));
	}
}
