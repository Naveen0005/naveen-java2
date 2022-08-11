package com.collection.demo;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		int evenSum=findSum(list);
		
		System.out.println("even Sum"+ evenSum);
	}

	
	public static int findSum(ArrayList<Integer> list) {
		int evenSum=0;
		
		for(int i=0;i<list.size();i++) {
			
			int n=list.get(i);
			
			if(n%2==0)
				evenSum = evenSum + n;
			
		}
		
		return evenSum;
		}
	}

