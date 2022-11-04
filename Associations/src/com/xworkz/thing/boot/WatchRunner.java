package com.xworkz.thing.boot;

import com.xworkz.thing.Watch;
import com.xworkz.thing.WatchModifier;

public class WatchRunner {

	public static void main(String[] args) {
		


				Watch watch = new Watch();
				WatchModifier modifier = new WatchModifier();
				modifier.useWatch(watch);
				System.out.println("Brand : " + watch.getBrand());
				System.out.println("Type : " + watch.getType());
				System.out.println("batteryBackUpDays : " + watch.getBatteryBackUpDays());
				System.out.println("Weight : " + watch.getWeight());
				System.out.println("Size : " + watch.getSize());
				System.out.println("ManufacturedBy : " + watch.getManufacturedBy());
				System.out.println("ManufacturedOn : " + watch.getManufacturedOn());
				System.out.println("MarketedBy : " + watch.getMarketedBy());
				System.out.println("HeadQuaters : " + watch.getHeadQuaters());
				System.out.println("warrantyInYears : " + watch.getWarrantyInYears());
				System.out.println("Email : " + watch.getEmail());

			}

	
	}


