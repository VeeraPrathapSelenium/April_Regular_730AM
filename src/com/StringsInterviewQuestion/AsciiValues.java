package com.StringsInterviewQuestion;

public class AsciiValues {

	public static void main(String[] args) {
		
	
	String str="my numeric is 8956";
	
	char[] arr=str.toCharArray();
	
	String temp="";
	for (char c : arr) {
		
		if((int)c>=(int)'0' && (int)c<=(int)'9')
		{
			temp=temp+c;
		}
		
		
		
	}
	
	System.out.println(temp);
	
	
	
	}

}
