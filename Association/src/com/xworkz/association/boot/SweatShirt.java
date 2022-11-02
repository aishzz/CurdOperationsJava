package com.xworkz.association.boot;

public class SweatShirt {
	
		public String name;
		private static int quantity=53;
		public String type;
		public boolean quality;
		private String brand = "Puma";
		private double price=1245;
		public String country;
		public char code;
		public String ownerName;
		public String producedBy;
		public long totalShirts;
		
		
	    
		public SweatShirt(String name, String type, boolean quality, String country, char code, String ownerName,
				String producedBy, long totalShirts) {
			super();
			this.name = name;
			this.type = type;
			this.quality = quality;
			this.country = country;
			this.code = code;
			this.ownerName = ownerName;
			this.producedBy = producedBy;
			this.totalShirts = totalShirts;
		}

		public String getBrand() {
			return brand;
		}

		  public void setBrand(String brand) {
			this.brand = brand;
		}

		public static int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		

}
