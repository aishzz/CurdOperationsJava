package com.xworkz.programs;

public class CountChar 
{
		public static void main(String[] args) 
		{
			String string="The best of both worlds in heigh";
			int count =0;
			
			for(int i=0;i<string.length();i++)
			{
				//if(string.charAt(i)==' ')//this code for count the white space
					count++;
			}
			
			System.out.println("Total number of characters in a string:"+count);
		}

	}