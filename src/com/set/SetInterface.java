package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {


		Set set=new HashSet();
		
		set.add("prathap");
		
		set.add("Ram");
		
		System.out.println(set.size());
		
		
		set.add("prathap");
		
		
		System.out.println("After adding duplicate"+set.size());

	}

}
