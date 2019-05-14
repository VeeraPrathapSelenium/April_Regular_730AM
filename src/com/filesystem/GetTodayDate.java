package com.filesystem;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GetTodayDate {

	public static void main(String[] args) {


		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		Date date=new Date();
		
		
		System.out.println(sdf.format(date));
		
		
		

	}

}
