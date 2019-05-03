package com.StringsInterviewQuestion;

public class RetriveNuimerics_Type2 {

	public static void main(String[] args) {
		String str="The voucher id 89623 is generated successfully";
		
		
		
		char[] arr=str.toCharArray();
		
		String temp="";
		
		for (char c : arr) {
			
			if((int)c>=(int)'A' && (int)c<=(int)'Z')
			{
				temp=temp+c;
			}
			
			
			
		}
		
		System.out.println("The numeric part is :"+temp);
		
		
		

	}

}
