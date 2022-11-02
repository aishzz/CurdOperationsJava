package com.xworkz.association;

public class Wedges {
	
		 private static String type;
		public static char[] getType;
		public String madeBy;
		public String brand;
		public String colour;           
		public String manufactureName;      
		public	 int price;
		public String use;  
		public String bachNo;
		public boolean good;
		public int height;

	 
	   public String gettype()
	 {
		return this.type; 
	 }
	  public void  setType(String wedgesUser)
	 {
		 System.out.println("type :"+wedgesUser);
		 this.type=wedgesUser;
	 }
	public void useWedges(Wedges wedgesUser) {
		System.out.println(wedgesUser);
	}

	}
	
