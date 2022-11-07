package com.xworkz.boot.child;

import com.xworkz.Encapsulation.thing.Court;

public class HighCourt extends Court
{

		public String state="Karnataka";
		public int noOfStatesUnderJurisdiction=1;
		
		public HighCourt(Court court)
		{
			System.out.println("Running HighCourt....");
		}
	
}
