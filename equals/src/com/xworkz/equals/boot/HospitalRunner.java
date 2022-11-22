package com.xworkz.equals.boot;

import com.xworkz.equals.Hospital;

public class HospitalRunner 
{

	public static void main(String[] args)
	{
		
			
				Hospital hospital=new Hospital();
				hospital.setCharges(150);
				hospital.setGood(false);
				hospital.setHospitalCode('l');
				hospital.setLocation("goa");
				hospital.setMdName("krishna");
				hospital.setName("Shruthi clinic");
				hospital.setTotalBranches(125);
				hospital.setTotalRevenue(895231L);
				hospital.setTotalStaffs(60);
				hospital.setType("multi-speciality");
				System.out.println(hospital);
				
				Hospital hospital2=new Hospital("appolo", "government-hospital", 100, 20, 'l', "raju", "pune", 628354L, false, 18);
				System.out.println(hospital2);
				
				boolean ref=hospital.equals(hospital2);
				System.out.println(ref);
			
	}

}
