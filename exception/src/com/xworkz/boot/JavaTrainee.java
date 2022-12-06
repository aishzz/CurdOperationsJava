package com.xworkz.boot;

	public abstract class JavaTrainee extends Person implements XworkzRules {

		public abstract String training();

		public abstract boolean sleep1();

		@Override
		boolean sleep() {
			System.out.println("Running the sleep");
			return false;
		}

		@Override
		String eat() {
			System.out.println("Running eat");
			return null;
		}

	
		public boolean uploadedTask() {
			System.out.println("Running uploadedTask");
			return false;
		}

		public boolean completedTask() {
			System.out.println("Running completedTask");
			return false;
		}

	}


