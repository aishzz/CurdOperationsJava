package com.xworkz.bigfish.boot.constant;

import com.xworkz.bigfish.newfile.Weapon;

public class God {
	
		public String name="Shiva";
		public char gender='M';
		public String mainPower="Blessings";
		public Weapon weapon=new Weapon("Trishul",10);
		
		public void godShowOff() {
			System.out.println("God name: "+name);
			System.out.println("God gender: "+gender);
			System.out.println("God main power: "+mainPower);
			System.out.println(System.lineSeparator());
			weapon.showOff();
		}
		
		
	}

}
