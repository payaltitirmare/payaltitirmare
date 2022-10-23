package com.codeo.Filepractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;


public class ReadFiles {

	public static void main(String[] args) {
	
		//by using bufferreader class
		try {
		File f = new File("D:/my files/Practice.text");
		
		BufferedReader bf = new BufferedReader(new FileReader(f));
		
		int c= bf.read();
		
		while( c!=-1) {
			System.out.print((char) c);
			
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
