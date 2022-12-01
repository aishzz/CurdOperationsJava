package com.xworkz.interaction.boot;

import com.xworkz.interaction.rules.Institute;

public class TrainingInstitue implements Institute {

	@Override
	public boolean training() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean placement() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double trainingPeriod() {
		// TODO Auto-generated method stub
		return 0;
	}
	public interface TestingInstitute extends Institute {
		void interview();
	}
}
