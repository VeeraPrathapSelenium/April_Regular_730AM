package com.filesystem;

import java.io.File;

public class CheckFile_Directory {

	public static void main(String[] args) {
		
		String path="C:\\Users\\Hanshik\\Desktop\\Strings Examples\\data.txt";
		
		File f=new File(path);
		
		
		if(f.isFile())
		{
			System.out.println("User given path is file");
		}else if(f.isDirectory())
		{
			System.out.println("User given path is directory");
		}else
		{
			System.out.println("Unknown format");
		}

	}

}
