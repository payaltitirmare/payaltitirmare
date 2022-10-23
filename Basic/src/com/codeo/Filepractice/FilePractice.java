package com.codeo.Filepractice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilePractice {

	public static void main(String[] args) {
	
		File f = new File("D:/my files/sunil.text");
	
		try {
			
			FileWriter fw = new FileWriter ("D:/my files/sunil.text");
			
			fw.write("hello sunil how are you") ;
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

}
