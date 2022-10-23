package com.codeo.Stringproject;

import java.util.Scanner;

public class Edurekjha {

	
	String name=null;
	
	public Edurekjha(String name) {
		this.name = name;
	
	
	}
	
	public Edurekjha() {
		
		name="unknown";
	}

	
	public static void main(String[] args) {
		
		
		
		Edurekjha ed = new Edurekjha();
		Edurekjha edd = new Edurekjha("ppp");
		
	System.out.println(ed.name);
	System.out.println(edd.name);
	}
	
}
