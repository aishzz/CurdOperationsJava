package com.xworkz.interaction.boot;


import com.xworkz.interaction.bridge.Archana;
import com.xworkz.interaction.rules.VinodaMam;

public class VinodaMamRunner {
	
		public static void main(String[] args) 
		{
			Archana ref = new Archana() {
				
				@Override
				public boolean checkStudentsGit() {
					// TODO Auto-generated method stub
					return false;
				}
			};
			ref.updateFeeStatus();
			ref.checkStudentsStatus();
			ref.presentations();
			ref.checkStudentsPresentation();
			ref.checkStudentsAttandance();
			
			System.out.println("-----------------------------------------");
			
	}

}
