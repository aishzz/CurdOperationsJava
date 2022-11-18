package com.xworkz.programs;

public class SwapWords {
	
		public static void main(String[] args) {
			String name;
			name="Iam going to Home";
			System.out.println("original string:"+name);
			String word[]=name.split(" ");
			String reverseString="";
			for(int i=word.length-1;i>=0;i--) {
				reverseString=reverseString+" "+word[i];
			}
			System.out.println("reversed String:"+reverseString);
			}


}
