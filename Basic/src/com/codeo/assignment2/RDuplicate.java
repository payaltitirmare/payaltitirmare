package com.codeo.assignment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RDuplicate {

	public static void main(String[] args) {
		// prime or not
		
		File  f = new File("D:/my files/new.text");
		
		try {
			f.createNewFile();
			
			FileWriter fw = new FileWriter ( "D:/my files/new.text" );
			
			fw.write("this is my practice so i am doing this");
			
			
			
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileInputStream fis = new  FileInputStream(f);
			int c = 0;
			
			while ((c= fis.read())!=-1)
			{
				System.out.print((char)c);
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
