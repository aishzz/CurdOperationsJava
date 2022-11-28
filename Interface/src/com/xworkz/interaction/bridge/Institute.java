package com.xworkz.interaction.bridge;

import com.xworkz.interaction.rules.InstituteRules;

public abstract class Institute implements InstituteRules {
	
		public String nameOfinstitute() {
			System.out.println("The companny Name is Xworkz");
			return null;
		}

		public String loctaionOfinstitute() {
			System.out.println("The Location of the Company is X_WORKZ");
			return null;
		}

		public String modeOfinstitute() {
			System.out.println("Work From Office");
			return null;
		}

		public double totalMemIninstitute() {
			System.out.println(" totalwomenInCompany :-"+280);
			return 0;
		}

		public String rulesOfinstitute() {
			System.out.println("Should complete Task");
			return null;
		
		}


}
