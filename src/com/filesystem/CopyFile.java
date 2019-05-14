package com.filesystem;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;


public class CopyFile {

	public static void main(String[] args) throws IOException {


		String src="C:\\Users\\Hanshik\\Desktop\\Strings Examples\\data.txt";
String dest="C:\\Users\\Hanshik\\Desktop\\Strings Examples\\Results\\14-05-2019\\myfile.txt";


File sc=new File(src);

File de=new File(dest);

FileUtils.copyFile(sc, de);






	}

}
