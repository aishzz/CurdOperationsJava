package com.xworkz.boot.child;

import com.xworkz.Encapsulation.thing.Court;

public class SupremeCourt extends Court
{

		public String country="INDIA";
		public int establishedYear=1935;
		
		public SupremeCourt(Court court)
		{
			System.out.println("Running SupremeCourt ....");
		}
	
}
