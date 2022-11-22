package com.xworkz.equals.boot;

import com.xworkz.equals.Institution;

public class InstitutionRunner {
	
		public static void main(String[] args) {
			Institution institution=new Institution();
			institution.setCode('L');
			institution.setFees(2954598L);
			institution.setGood(true);
			institution.setLocation("Mysore");
			institution.setName("Xworkz");
			institution.setPrincipalName("ramu");
			institution.setTotalBranches(45);
			institution.setTotalRevenue(28L);
			institution.setTotalStaffs(250);
			institution.setType("technology based");
			System.out.println(institution);
			
			Institution institution2=new Institution("Xworkz", "Training", 85460L, 125, 'p', "LOKI", "Hariyana", 4521365L, false, 102);
			System.out.println(institution2);
			boolean ref=institution.equals(institution2);
			System.out.println(ref);

	}
}
