package com.filesystem;

import java.io.File;

public class GetFreeSize {

	public static void main(String[] args) {


		String path="C:\\Users\\Hanshik\\Desktop\\Strings Examples";
				
		File f=new File(path);
		

System.out.println(f.getAbsolutePath());

System.out.println(f.getName());

System.out.println(f.getFreeSpace());	

System.out.println(f.getTotalSpace());



	}

}
