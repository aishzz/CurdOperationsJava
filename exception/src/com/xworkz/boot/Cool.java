package com.xworkz.boot;

	public class Cool extends JavaTrainee implements KarnatakaRTO {

		public double vat() {
			System.out.println("Running vat");
			return 0;
		}

		public Cool(String name) {
			super();
			this.name=name;
			
		}

		@Override
		public String training() {
			System.out.println("Running training");
			return null;
		}

		@Override
		public boolean sleep1() {
			System.out.println("Running sleep1");
			return false;
		}

		@Override
		public boolean sleep() {
			System.out.println("Running sleep");
			return false;
		}
		@Override
		public String eat() {
			System.out.println("Running the eat");
			return"Helo";
		}

	}

}
