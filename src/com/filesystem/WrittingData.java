package com.filesystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WrittingData {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\Hanshik\\Desktop\\Strings Examples";
		
		String filename="abc.txt";
		
		File f=new File(path,filename);
		
		FileWriter fw=new FileWriter(f);
		
		PrintWriter pw=new PrintWriter(fw);
		
		pw.println("Hello 1");
		pw.println("Hello 2");
		pw.println(65);
		
		pw.flush();
		pw.close();
		fw.close();
	}

}


