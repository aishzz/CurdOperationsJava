package com.xworkz.bigfish.boot.constant;

public class Mountain {
	
	
		public String name;
		public Location location=new Location();
		public double height;
		public Temple temple=new Temple();
		
		public Mountain() {
			
		System.out.println("Mountain class....");
		}
		public void displayMountain(String name, double height) {
			this.name=name;
			this.height=height;
			System.out.println("Mountain name: "+name);
			System.out.println("Mountain height: "+height);
		}
		
		
	}


