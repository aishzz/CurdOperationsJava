package com.xworkz.programs;

import java.util.Scanner;

public class CountWideSpace {

	public static void main(String[] args) {

		String str;
		int space=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		str=scan.nextLine();
		
		int i=0;
		while(i<str.length()) {
			char ch=str.charAt(i);
			if(ch==' ') 
			{
				space++;
				
			}
			i++;
		}
System.out.println("total wide space:"+space);
	}

}
