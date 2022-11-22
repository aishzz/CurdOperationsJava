package com.xworkz.equals.boot;

import com.xworkz.equals.God;

public class GodRunner {
	
		public static void main(String[] args) {
			God god=new God();
			god.setEntryFees(60);
			god.setGodCode('g');
			god.setGodPoojaName("raju");
			god.setLocation("mysore");
			god.setName("ganesha");
			god.setOriginalName("ganapathi");
			god.setPowerFull(true);
			god.setPriestName("ramu");
			god.setTotalDieties(15);
			god.setTotalTemples(100);
			System.out.println(god);
			
			God god2=new God("Ganesha", "Ganapathi", 10, 'M', "Mysore", 6, "prabhu", 20, true, "ganapa");
			System.out.println(god2);
			boolean ref=god.equals(god2);
			System.out.println(ref);
		
	}
}
