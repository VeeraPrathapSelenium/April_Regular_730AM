package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListArray {

	public static void main(String[] args) {


		List list=new ArrayList();
		
		
		// add elements to the list
		
		list.add("A");
		
		list.add("C");
		
		list.add("B");
		
		//print the values from the list 
		//System.out.println(list.get(0));
		
		//get all the elements from the list
		
		int size=list.size()-1;
		
		/*
		for(int i=0;i<=size;i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("************************");
		
		for (Object object : list) {
			
			System.out.println(object);
		}
		System.out.println("************************");
		// getting values using iterator
		
		Iterator itr=list.listIterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		
		//System.out.println(list.isEmpty());
		
		
		
		
		
	System.out.println("Before:");	
		
		
Iterator itr=list.listIterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	System.out.println("After:");	
	
	
	list.add(0, "G");
	
	
itr=list.listIterator();
	
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("Remove an Element :");
	list.remove("A");
	
itr=list.listIterator();
	
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	}

}
