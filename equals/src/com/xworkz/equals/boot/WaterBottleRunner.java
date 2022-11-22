package com.xworkz.equals.boot;

import com.xworkz.equals.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {

		WaterBottle waterBottle= new  WaterBottle("Asian","Virat", null, 100, 0,"kshna", null,1000, 0, null);
		waterBottle.setBrand("Asian");
		waterBottle.setAmbasidor("Virat");
		waterBottle.setColour(null);
		waterBottle.setLifeTime(10);
		waterBottle.setManufacture("kshna");
		waterBottle.setName();
		waterBottle.setPrice(1000);
		waterBottle.setQuantity(0);
		waterBottle.setValidity(0);
				
		WaterBottle vehicle2=new  WaterBottle(" asian","virat","orange",10,"krishna","paint",1000,10,4);
		System.out.println(vehicle2);
		boolean same=waterBottle.equals(vehicle2);
		System.out.println(same);
		

	}

}
