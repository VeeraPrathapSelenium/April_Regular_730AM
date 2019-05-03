package com.StringsInterviewQuestion;

public class CountVowels_Consonants {

	public static void main(String[] args) {

int vowels =0;

int consonants=0;

		String str="Welcome to java selenium training";
		
		
		str=str.toLowerCase();
		char[] c=str.toCharArray();
		
		
		for (char charc : c) {
			
			if(! Character.isWhitespace(charc))
			{
				if(charc=='a' || charc=='e' || charc=='i'  || charc=='o'|| charc=='u')  
					
					{
					vowels=vowels+1;
					
					}
				else
				{
					consonants=consonants+1;
				}
			}
			
			
		}
		
		
System.out.println("The total vowels count :="+vowels);

System.out.println("The total consonants count :="+consonants);
	}

}
