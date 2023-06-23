package com.java.basics;

import java.util.Arrays;

public class A6_String {

	public static void main(String[] args) {
		
		String text = "Hello, My name is Sachin";  
        
		/* Splits the sentence by the delimiter passed as an argument and returns a string array*/  
        String[] sentences = text.split("\\s");  
        System.out.println(Arrays.toString(sentences)); 
        
        for (String i : sentences)
        {
        	System.out.println(i);
        }
        
        //Join
        //The Java String class join() method returns a string joined with a given delimiter. 
        //In the String join() method, the delimiter is copied for each element. The join() method is included in the Java string since JDK 1.8.
        String sjoin = String.join("--","Welcome", "to", "Java");
        System.out.println(sjoin);
        
        //  CompareTo returns int value
        text = "  MS DHONI    ";
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
        
        
        System.out.println(text.toLowerCase());
        System.out.println(text.trim());
        
        System.out.println(text.replace(text, "MARIAM SHALINI JACK JUTURU") );
        
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println( sb.reverse() );
        
        
	}

}
