package com.Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {

// setting data to the members of the class
		Encapsulation encap=new Encapsulation();
		encap.setStudentname("Prathap");
		encap.setStudentclass("Xth class");
		encap.setAge(10);
		
// getting the data
		
		System.out.println("The Name of the student is :"+encap.getStudentname());
		System.out.println("The class of the student is :"+encap.getStudentclass());
		System.out.println("The Age of the student is :"+encap.getAge());
	}

}
