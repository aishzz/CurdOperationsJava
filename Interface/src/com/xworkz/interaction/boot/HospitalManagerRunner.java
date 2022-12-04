package com.xworkz.interaction.boot;

import com.xworkz.interaction.Governer.HospitalManager;
import com.xworkz.interaction.follower.Doctor;
import com.xworkz.interaction.rules.HospitalRule;

public class HospitalManagerRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HospitalRule hospitalRule = new Doctor();
		HospitalManager management = new HospitalManager(hospitalRule);
		management.checking();

	}

}
