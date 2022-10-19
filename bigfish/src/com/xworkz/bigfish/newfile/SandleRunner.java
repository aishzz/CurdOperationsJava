package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.Sandle;

public class SandleRunner {

	public static void main(String[] args)
	{
		
				String[] otherCompetaters = { "paragon", "Wakmate", "zudio", "bata" };
				String[] otherTypes = { "Heels", "Flat", "Wedges", "Daily Use" };
				char[] sizes = { 'S', 'M', 'L' };
				String[] otherWebsites = { "Meshoo", "Myntra", "Flipkart" };
				int[] pricesInOtherWebsites = { 1200, 899, 1044, 799 };
				String[] toWhom = { "Women", "Men", "Others" };

				Sandle sandle = new Sandle("zudio", "Flat",899, "Meshoo", true, otherCompetaters, otherTypes, sizes,
						otherWebsites, pricesInOtherWebsites, toWhom);

				sandle.display();

			}


	}


