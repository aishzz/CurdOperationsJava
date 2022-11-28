package com.xworkz.interaction.boot;

import com.xworkz.interaction.bridge.Institution;
import com.xworkz.interaction.rules.InstitutionRules;

public class InstitutionRulesRunner {

		public static void main(String[] args) {
			InstitutionRules add=new Institution();
			add.nameOfInstitution();
			add.locationOfInstitution();
			add.rulesOfInstitution();
			add.headOfInstitution();
			add.noOfStaff();

		}

	
}
