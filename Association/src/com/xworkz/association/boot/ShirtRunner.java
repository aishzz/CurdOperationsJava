package com.xworkz.association.boot;

import com.xworkz.association.Shirt;

public class ShirtRunner {

	public static void main(String[] args) {
		

				Shirt shirt=new Shirt();
				SweatShirt sweatShirt=new SweatShirt("zudio", "string", true, "country", 'G', "mahalaksmi", "zudio company", 25945L);
					
				System.out.println(shirt.name);
				System.out.println(shirt.sweatShirt);
				System.out.println(sweatShirt.getBrand());
				System.out.println(sweatShirt.getPrice());
				System.out.println(sweatShirt.getQuantity());
				
				shirt.showOff();
				
			}

}
