package com.xworkz.interaction.boot;

import com.xworkz.interaction.bridge.Archana;
import com.xworkz.interaction.rules.VinodaMam;

public class VinodaMamRunner {
	
		public static void main(String[] args) 
		{
			
			Archana ref = new Archana();
			ref.updateFeeStatus();
			ref.checkStudentsStatus();
			ref.presentations();
			ref.checkStudentsPresentation();
			ref.checkStudentsAttandance();
			
			System.out.println("-----------------------------------------");
			
			VinodaMam ref1= new Archana();
			ref1.updateFeeStatus();
			ref1.checkStudentsStatus();
			ref1.checkStudentsPresentation();
			ref1.checkStudentsAttandance();
	}

}
