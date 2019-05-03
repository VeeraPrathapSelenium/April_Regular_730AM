package com.ConditionalStatements;

public class SimpleIf {

	public static void main(String[] args) {

int telugu_tickets=0;

int hindhi_tickets=0;

// checking for telugu movie
if(!(telugu_tickets==0))
{
	System.out.println("Book  for telugu movie");
}

// checking for hindhi movie when there is no tickets available for telugu
else if(!(hindhi_tickets==0))
{
	System.out.println("Book for hindhi movie");
}
// this will be execute when all the above conditions are failed
else
{
	System.out.println("No tickets available for both hindhi and telugu");
}
		
		

	}

}
