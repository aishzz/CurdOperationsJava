package com.xworkz.association.boot;

import com.xworkz.association.SmartBoard;

public class SmartUserRunner {
	
		public static void main(String[] args) {
			
			System.out.println(SmartBoard.getType);
			SmartBoard wedgesUser= new SmartBoard();
			System.out.println(SmartBoard.getType);
			wedgesUser.useWedges(wedgesUser);
			wedgesUser.gettype();

				}

		}



}
