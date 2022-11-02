package com.xworkz.association;

import com.xworkz.association.boot.SweatShirt;

public class Shirt {
	
		public String name = "HALFSLEEVES";
		public SweatShirt sweatShirt = new SweatShirt("zudio", "string", true, "country", 'G', "mahalakshmi",
				"zudio company", 289451L);

		public void showOff() {
			System.out.println(this.name);
			if (this.sweatShirt != null) {

				System.out.println(this.sweatShirt);
				System.out.println(sweatShirt.name);
				System.out.println(sweatShirt.type);
				System.out.println(sweatShirt.quality);
				System.out.println(sweatShirt.country);
				System.out.println(sweatShirt.code);
				System.out.println(sweatShirt.ownerName);
				System.out.println(sweatShirt.producedBy);
				System.out.println(sweatShirt.totalShirts);
				

				System.out.println(sweatShirt.getBrand());
				sweatShirt.setBrand("Zara"); 
				System.out.println("after modifying " + sweatShirt.getBrand());

				System.out.println(sweatShirt.getPrice());
				sweatShirt.setPrice(1240);
				System.out.println("after modifying " + sweatShirt.getPrice());

				System.out.println(SweatShirt.getQuantity());
				sweatShirt.setQuantity(32);
				System.out.println("after modifying " + sweatShirt.getQuantity());
			} else {
				System.out.println("no sweatShirt");
			}

		}

	}

