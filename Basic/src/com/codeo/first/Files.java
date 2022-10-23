package com.codeo.first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class Files {

	//how to create file 
	//how to write file
	//how to read file
	//how to delete file
	
	public static void main(String[] args) {
		
		File f  = new File("D://my files//pppp.text");
		
		try {
		
			FileWriter fw = new FileWriter("D://my files//pppp.text");
			
			fw.write("hwey dude i am just practicing this");
			
			fw.close();
		
		BufferedReader bf = new BufferedReader(new FileReader(f));
		
		int c=0;
		
		while((c = bf.read())!=-1)
		{
			System.out.print((char)c);
		}
		
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}

	}	
	
}
