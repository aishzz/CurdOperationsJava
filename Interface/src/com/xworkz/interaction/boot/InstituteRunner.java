package com.xworkz.interaction.boot;

import com.xworkz.interaction.rules.DevelopmentInstitute;
import com.xworkz.interaction.rules.Institute;
import com.xworkz.interaction.rules.TrainingInstitute;
import com.xworkz.interaction.rules.Xworkz;

public class InstituteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	DevelopmentInstitute developmentInstitute=new DevelopmentInstitute() {
		
		@Override
		public double trainingPeriod() {
			System.out.println("running training period");
			return 0;
		}
		
		@Override
		public boolean training() {
			System.out.println("running training ");
			return false;
		}
		
		@Override
		public boolean placement() {
			// TODO Auto-generated method stub
			System.out.println("running placement");
			return false;
		}
		
		@Override
		public boolean coding() {
			// TODO Auto-generated method stub
			System.out.println("running coding");
			return false;
		}
	};
	TrainingInstitute trainingInstitute=new TrainingInstitute() {
		
		@Override
		public double trainingPeriod() {
			// TODO Auto-generated method stub
			System.out.println("running training period");
			
			return 0;
		}
		
		@Override
		public boolean training() {
			// TODO Auto-generated method stub
			System.out.println("running training ");
			
			return false;
		}
		
		@Override
		public boolean placement() {
			// TODO Auto-generated method stub
			System.out.println("running training placement");
			
			return false;
		}
		
		@Override
		public void interview() {
			// TODO Auto-generated method stub
			System.out.println("running interview");
			
			
		}
		
	};
	Institute institute = new TrainingInstitue();
	institute.placement();
	institute.training();
	institute.trainingPeriod();
	System.out.println("-running Training institute-");
	

	 
	 


	}

}
