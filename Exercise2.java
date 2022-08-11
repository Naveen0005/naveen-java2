package com.collection.demo;
import java.util.*;
public class Exercise2 {

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
		
		
		for(int i=0;i<words.size();i++) {
			
			String n=words.get(i);
			
			if(n.length()==5){
				System.out.println(n);
			}
		}
	}
}
	


