package com.xworkz.programs;

public class VowelConsonent {
	
		public static void main(String[] args) {

			String name="Best of Best";
			int vCount=0,cCount=0;
			name=name.toLowerCase();
			
			for(int i=0;i<name.length();i++) {
				
				if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u') {
					
					vCount++;
				}
				else if(name.charAt(i)>='a' && name.charAt(i)<='z') {
					cCount++;
					
				}
					
			}
			System.out.println("Vowels="+vCount);
			System.out.println("Consonents="+cCount);
			
		}

	

}