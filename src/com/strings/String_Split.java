package com.strings;

public class String_Split {

	public static void main(String[] args) {
		String str="America Japan Pakistan";
		
		//step1: Split the string with the delimter " "
		String [] arr=str.split(" ");
		
		//Create a temp variable to store actual output data
		String outputdata="";
		
		//
		String_Split obj=new String_Split();
		
		for (String string : arr) {
			
			
			outputdata=outputdata+obj.reverseString(string)+" ";
			
			
			
		}
		
		System.out.println(outputdata);
		
		

	}
	
	//JavaTraining
	//gnin..J
	
	public String reverseString(String data)
	{
		String result="";
		
		for(int i=data.length()-1;i>=0;i--)
		{
			result=result+data.charAt(i);
		}
		return result;
	}
	
	
	
	

}
