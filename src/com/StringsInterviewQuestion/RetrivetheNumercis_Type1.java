package com.StringsInterviewQuestion;

public class RetrivetheNumercis_Type1 {

	public static void main(String[] args) {


		String str="The voucher id 8956 is generated successfully";
		
		String result=getNumeric(str);
		
		System.out.println("The numeric is "+result);
		
		

	}
	
	
	
	public static String getNumeric(String inputstring)
	{
int strlen=inputstring.length()-1;
		
		String temp="";
		
		for(int i=0;i<=strlen;i++)
		{
			
			char c=inputstring.charAt(i);
			
			if(Character.isDigit(c))
			{
				temp=temp+c;
			}
			
			
			
		}
		
		return temp;
		
	}

}
