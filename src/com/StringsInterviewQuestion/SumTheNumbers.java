package com.StringsInterviewQuestion;

public class SumTheNumbers {

	public static void main(String[] args) {


		String str="AB65CD89FG74";
		
		int sum =0;
		str=str.replaceAll("[^0-9]", "@");
		
		System.out.println(str);
		
		
		String[] arr=str.split("@");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(!arr[i].isEmpty())
			{
				sum=sum+Integer.valueOf(arr[i]);
			}
		}
		
		System.out.println(sum);
		
		
		
		

	}

}
