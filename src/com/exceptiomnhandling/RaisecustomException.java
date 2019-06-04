package com.exceptiomnhandling;

public class RaisecustomException {

	public static void main(String[] args) {


		int a=10;
		
		int b=5;
		
		
		if(a>b)
		{
			//  raise an exception
			
			
			try {
				throw new CustomException("A  can not be greater than B");
			} catch (CustomException e) {
				
				e.printStackTrace();
			}
			catch(Exception e)
			{
				
			}
		}
		else
		{
			//proceed
		}
		
		
		
		

	}

}
