package com.java.basics;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class C15FileWriter {
	
	public static void main(String[] args) throws Exception
	{
		String flPath = "C:\\Users\\mrufu\\OneDrive\\Desktop\\EGGS.txt";
		
		//FileWriter fw = new FileWriter(flPath);			//Writing
		FileWriter fw = new FileWriter(flPath , true);		//Appending
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("It started in March 2023");
		bw.newLine();
		bw.write("Might finish in July 2023");
		bw.newLine();
		bw.close();  
		fw.close();
	}
}