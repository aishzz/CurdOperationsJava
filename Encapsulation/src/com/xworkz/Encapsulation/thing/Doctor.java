package com.xworkz.Encapsulation.thing;

import com.xworkz.boot.constant.Gender;

public class Doctor {
	
		public String name;
		public String specialist;
		public double income;
		public Gender gender;

		public void setName(String name) {
			this.name = name;
		}

		public void setSpecialist(String specialist) {
			this.specialist = specialist;
		}

		public void setIncome(double income) {
			this.income = income;
		}

		public void setGender(Gender male) {
			this.gender = male;
		}

		public Doctor() {
			System.out.println("Default const of Doctor....");
		}

	}


