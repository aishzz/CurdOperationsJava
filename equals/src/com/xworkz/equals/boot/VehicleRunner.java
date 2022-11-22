package com.xworkz.equals.boot;

import com.xworkz.equals.Vehicle;

public class VehicleRunner {


			public static void main(String[] args) {
				 Vehicle  vehicle= new  Vehicle("Asian","Virat", null, 100, 0,"kshna", null,1000, 0, null);
				 vehicle.setBrand("Asian");
				 vehicle.setAmbasidor("Virat");
				 vehicle.setColour(null);
				 vehicle.setLifeTime(10);
				 vehicle.setManufacture("kshna");
				 vehicle.setName();
				 vehicle.setPrice(1000);
				 vehicle.setQuantity(0);
				 vehicle.setValidity(0);
				
				 Vehicle vehicle2=new  Vehicle(" asian","virat","orange",10,"krishna","paint",1000,10,4);
		System.out.println(vehicle2);
		boolean same=vehicle.equals(vehicle2);
		System.out.println(same);
			
	}

}
