package com.codeo.coedsdope;

import java.util.Scanner;

public class Area {

	String name= null;
	int roll_no = 0;
	
	
	public Area(String name, int roll_no) {
		
		this.name= name;
		this.roll_no=roll_no;
		
	}


	public static void main(String[] args) {
		
		
		Area a = new Area("john" , 2);
		
		System.out.println(a.name+"  "+a.roll_no);
		
	
	}
}
