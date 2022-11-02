package com.xworkz.association.boot;

import com.xworkz.association.Wedges;

public class User {
	
	
		private String name="Twinkle";
		public Wedges wedges;
		public void useWedges(Wedges wedges)
		
		{
			System.out.println(wedges);
			System.out.println(wedges.bachNo);
			System.out.println(wedges.brand);
			System.out.println(wedges.colour);
			System.out.println(wedges.height);
			System.out.println(wedges.madeBy);
			System.out.println(wedges.manufactureName);
			System.out.println(wedges.price);
			System.out.println(wedges.use);
         wedges.setType("heigh");
         System.out.println("after modifying : "+ wedges.gettype());
         
		}
		
	}

