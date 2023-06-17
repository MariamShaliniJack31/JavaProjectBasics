package com.java.basics;

import java.util.Arrays;

public class A6_String {

	public static void main(String[] args) {
		
		String text = "Hello, My name is Sachin";  
        
		/* Splits the sentence by the delimiter passed as an argument */  
        String[] sentences = text.split(" ");  
        System.out.println(Arrays.toString(sentences)); 
        
        for (String i : sentences)
        {
        	System.out.println(i);
        }
        
        //  CompareTo returns int value
        text = "MS DHONI";
        System.out.println(text.compareTo("Sachin"));

        //  Concat returns String
        System.out.println(text.concat(" DHONI"));
        
        //  Substring Sting
        System.out.println(text.substring(0, 5));
        
//        toUpperCase() and toLowerCase() method
//        trim()
//        startsWith() and endsWith() - Boolean
//        s.charAt(0)  - character
//        length() – int
        //replace() method replaces all occurrence of first sequence of character with second sequence of character.
        System.out.println(text.replace("MS", "MR"));
	}

}
