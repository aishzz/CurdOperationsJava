package com.xworkz.association;

import com.xworkz.LedBulb;

public class StoreManager {
 public String name ="phillips";
 public  LedBulb ledBulb;
 
 public void useLedBulb(LedBulb ledBulb) {
	 System.out.println(ledBulb);
	 System.out.println(ledBulb.ownerHusbandName);
	 System.out.println(ledBulb.ownerName);
	 System.out.println(ledBulb.price);
	 System.out.println(ledBulb.getBrand());
	 ledBulb.setBrand("livino");
	 System.out.println("after modifying : "+ ledBulb.getBrand());
 }
}
