package com.xworkz.bigfish.boot;

public class Capsule {

		public String name;
		public String area;
		public int areaPincode;
		public String ownerName;
		public String timings;

		public String[] paymentOptions;
		public String[] itemTypes;
		public String[] dolo;
		public String[] use;
		public double[] packingCovers;

		public Capsule(String name, String area, int areaPincode, String ownerName, String timings,
				String[] paymentOptions, String[] itemTypes, String[] dolo, String[] use,
				double[] packingCovers) {

			this.name = name;
			this.area = area;
			this.areaPincode = areaPincode;
			this.ownerName = ownerName;
			this.timings = timings;

			this.paymentOptions = paymentOptions;
			this.itemTypes = itemTypes;
			this.dolo = dolo;
			this.use = use;
			this.packingCovers = packingCovers;

		}

		public  void display() {
			System.out.println("Name : " + this.name);
			System.out.println("Area : " + this.area);
			System.out.println("Area Pincode : " + this.areaPincode);
			System.out.println("Owner Name : " + this.ownerName);
			System.out.println("Opening Hours :" + this.timings);

			System.out.println(System.lineSeparator() + "====Payment Options====");
			for (int i = 0; i < paymentOptions.length; i++) {
				String string = paymentOptions[i];
				System.out.println(string);
			}
			System.out.println(System.lineSeparator() + "====Item Types====");
			for (int i = 0; i < itemTypes.length; i++) {
				String string = itemTypes[i];
				System.out.println(string);
			}
			System.out.println(System.lineSeparator() + "====Cool Drinks====");
			for (int i = 0; i <dolo.length; i++) {
				String string = dolo[i];
				System.out.println(string);
			}

			System.out.println(System.lineSeparator() + "====Shampoos====");
			for (int i = 0; i < use.length; i++) {
				String string = use[i];
				System.out.println(string);
			}
			
			System.out.println(System.lineSeparator() + "====Packing Covers====");
			for (int i = 0; i < packingCovers.length; i++) {
				double d = packingCovers[i];
				System.out.println(d);
			}

		}
	}

