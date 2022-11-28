package com.xworkz.interaction.bridge;

import com.xworkz.interaction.rules.InstitutionRules;

public class Institution  implements InstitutionRules {

	@Override
	public String nameOfInstitution() {
		System.out.println("nameOfInstitution");
		return null;
	}

	@Override
	public String locationOfInstitution() {
		System.out.println("locationOfInstitution");
		return null;
	}

	@Override
	public String rulesOfInstitution() {
		System.out.println("rulesOfInstitution");
		return null;
	}

	@Override
	public String headOfInstitution() {
		System.out.println("chairmanOfInstitution");
		return null;
	}

	@Override
	public int noOfStaff() {
		System.out.println("principleofInstitution");
		return 0;
	}


}
