package com.xworkz.programs;

public class TwoD {
	

		public static void main(String[] args) {
			int[][] array = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
			for(int i=0;i<array.length;i++) {
				for(int j=0;j<array[i].length;j++) {
					System.out.println(array[i][j]+ "  ");
				}
				System.out.println();
				
			}

	
	}

}