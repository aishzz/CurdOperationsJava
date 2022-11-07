package com.xworkz.boot.child;

import com.xworkz.Encapsulation.thing.Court;

public class DistrictCourt extends Court
{

		public String district="Tumkur";
		public int noOfTaluksUnderJurisdiction=10;
		
		public DistrictCourt(Court court)
		{
			System.out.println("Running District Court....");
		
	}
}
