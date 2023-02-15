package com.java.basics;

import java.util.Arrays;

public class A6_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Hello, My name is Sachin";  
        
		/* Splits the sentence by the delimeter passed as an argument */  
        String[] sentences = text.split(" ");  
        System.out.println(Arrays.toString(sentences)); 
        
        for (String i : sentences)
        {
        	System.out.println(i);
        }
	}

}
