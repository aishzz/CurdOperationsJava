package com.xworkz.bigfish.boot.constant;

public class Fule<Brand> {


		public boolean special = true;
		public float price;
		public int quantity;
		public Brand brand = new Brand();// class
		public Type type;


		public Fule(boolean special, float price, int quantity, Brand brand, Type type) {
			super();
			this.special = special;
			this.price = price;
			this.quantity = quantity;
			this.brand = brand;
			this.type = type;
		}

		public void showOff() 
		{
			System.out.println("Special:" + special);
			System.out.println("Fuel price: " + price);
			System.out.println("Fuel quantity: " + quantity);
			System.out.println("Fuel Type: "+Type.KEROSINE);

		}

		public void showOff1() 
		{
			System.out.println(this.quantity);
			
		}
		
		
		
	}

