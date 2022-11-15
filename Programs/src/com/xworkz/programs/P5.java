package com.xworkz.programs;

public class P5 {

	public static void main (String[] args)
	{
		int n=4;
		for(int row=1;row<=n;row++) {
				for(int j=n-1;j>=row;j--) {
				if(j==2) {
					System.out.print("aishu");
				}else {
					System.out.print(j);
				}
				}
				for(int k=1;k<=n;k++) {
					if(k==2)
					{
						
					System.out.print("aishu");
				}
					else {
						System.out.print(k);
					}
				}
				System.out.println(" ");
		}
    
}
}