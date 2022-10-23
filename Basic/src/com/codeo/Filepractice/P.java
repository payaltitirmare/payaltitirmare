package com.codeo.Filepractice;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class P  extends Thread {
	
  
	public static void main(String[] args) {
		
		int arr[] = {21,4,23,83,55,21,23}; 
		int duplicate =0;
		
	LinkedList <Integer> al = new LinkedList <> ();
	
	for (int i=0; i<arr.length ;i++)  
	{
		for(int j=i+1; j<arr.length ;j++)
		{
		
			if(arr[i] == arr[j])
			                 {
			al.add(arr[i]);
		}
			
		}	}
	
	System.out.println(duplicate);
     }
   }