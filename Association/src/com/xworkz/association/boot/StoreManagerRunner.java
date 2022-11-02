package com.xworkz.association.boot;

import com.xworkz.LedBulb;
import com.xworkz.association.StoreManager;

public class StoreManagerRunner {

	public static void main(String[] args) {
	StoreManager manager = new StoreManager();
	LedBulb ledbulb = new LedBulb();
	
	System.out.println(ledbulb.getBrand());
	manager.useLedBulb(ledbulb);
	
	System.out.println("after modifying in runner"+ ledbulb.getBrand());
	System.out.println(manager.name);
	System.out.println(manager.ledBulb);
	

	}

}