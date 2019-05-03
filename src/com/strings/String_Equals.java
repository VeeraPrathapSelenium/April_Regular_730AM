package com.strings;

public class String_Equals {

	public static void main(String[] args) {
		String str1="Hello";
		
		String str2="hello";
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.contentEquals(str2));

	}

}
