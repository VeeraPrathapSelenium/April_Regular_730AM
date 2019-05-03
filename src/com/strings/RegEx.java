package com.strings;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {


// step 1: Declare the Pattern using pattern class
		
		String input="my date of birth is 09/08/1990";
		
		String pattern="[0-9]{2}\\/[0-9]{2}\\/[0-9]{4}";
		
		Pattern p=Pattern.compile(pattern);
// Use Matcher class to fetch the data
		
		
		Matcher m=p.matcher(input);
		
		while(m.find())
		{
			System.out.println(m.group());
		}
				
				
	

	}

}
