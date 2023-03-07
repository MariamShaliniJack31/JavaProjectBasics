package com.java.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class C14FileReader {
	
	public static void main(String[] args) throws Exception
	{
		String flPath = "C:\\Users\\mrufu\\OneDrive\\Desktop\\EGGS.txt";
		
		//We can use FileReader and BufferedReader classes to read line by line data from text files.
		//FileReader cannot read line by line data., It reads character by character That’s why we have to use buffered reader class
		FileReader fr = new FileReader(flPath);
		BufferedReader br = new BufferedReader(fr);
		String ln = br.readLine();
		while (ln != null) {
			System.out.println(ln);
			ln = br.readLine();
		}
		fr.close();
		
		//Folder Creation – It creates folder with name FileCreation on Desktop
		String filepath = "C:\\Users\\mrufu\\OneDrive\\Desktop\\FileCreation";
		File fl = new File(filepath);
		fl.mkdir();
				
		String fPath = "C:\\Users\\mrufu\\OneDrive\\Desktop\\d1\\d2";
		File flp = new File(fPath);
		flp.mkdirs();


	}
}
