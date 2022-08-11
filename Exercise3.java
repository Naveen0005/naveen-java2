package com.collection.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
		words.add("naveen");
		words.add("hello");
		words.add("ashwin");
		words.add("notes");
		words.add("mani");
		
		findWord(words);
		

	}
	
	public static void findWord(ArrayList<String> words) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the word length");
		int l=s.nextInt();
		
		
		for(int i=0;i<words.size();i++) {
			
			String n=words.get(i);
			
			if(n.length()==l){
				System.out.println(n);
			}
			
		}
		
		s.close();

	}
	
}
