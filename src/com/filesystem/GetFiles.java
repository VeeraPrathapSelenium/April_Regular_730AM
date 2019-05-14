package com.filesystem;

import java.io.File;

public class GetFiles {

	public static void main(String[] args) {


		String path="C:\\Users\\Hanshik\\Desktop\\Strings Examples";
		
		File f=new File(path);
		
		
		File[] arr=f.listFiles();
		
		

for (File file : arr) {
	System.out.println(file);
}
		
		
		
		

	}

}
