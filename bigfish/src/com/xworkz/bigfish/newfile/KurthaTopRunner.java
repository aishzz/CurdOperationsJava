package com.xworkz.bigfish.newfile;

import com.xworkz.bigfish.boot.KurthaTop;

public class KurthaTopRunner {

			public static void main(String[] args)
			{
				
						String[] otherCompetaters = { "Awaz", "Zara", "Lotus", "Zudio" };
						String[] otherTypes = { "shortTop", "LongTop", "Westren", "PlazooSet" };
						char[] sizes = { 'S', 'M', 'X' };
						String[] otherWebsites = { "Meshoo", "Myntra", "Flipkart" };
						int[] pricesInOtherWebsites = { 1200, 899, 1044, 5200 };
						String[] toWhom = { "Women", "Kids", "Girls" };

						KurthaTop kurthaTop = new KurthaTop("Zara", "PlazooSet",899, "Meshoo", true, otherCompetaters, otherTypes, sizes,
								otherWebsites, pricesInOtherWebsites, toWhom);

						kurthaTop.display();

					}

	}

