package com.xworkz.programs;

public class Amstrong {
	
		public static void main(String[] args) {
			int n=546,rev=0,c,sum=0;
			for(;n!=0;n=n/10) {
				c=n%10;
				int temp=c*c*c;
				rev++;
				sum=sum+temp;
				System.out.println(temp);
				System.out.println("sum is "+sum);
				System.out.println("count is "+rev);	
				
				
	

		}

	}

}
