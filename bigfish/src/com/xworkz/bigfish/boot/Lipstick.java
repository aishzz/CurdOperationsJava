package com.xworkz.bigfish.boot;

public class Lipstick {
	public static String name;
	public static String city;
	public static String brand;
	public static int price;
	public static String colour;
	
	public String[] type;
	public String[] size;
	public String[] manufactureName;
	public long[] manufactureNumber;
	public String[] lipstickAmbasider;
	
	public Lipstick(String name, String city, String brand,int price , String colour, String[] type, String[] size, String[] manufactureName,
			String[] lipstickAmbasider)
	{
		this.name = name;
		this.city = city;
		this.brand = brand;
		this.price = price;
		this.colour = colour;
		
		this.type = type;
		this.size= size;
		this.manufactureName = manufactureName;
		this.manufactureNumber = manufactureNumber;
		this.lipstickAmbasider = lipstickAmbasider;
	}
	
	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("City : " + this.city);
		System.out.println("brand : " + this.brand);
		System.out.println("price : " + this.price);
		System.out.println("Colour :" + this.colour);

		for (int i = 0; i < lipstickAmbasider.length; i++) {
			String string=lipstickAmbasider[i];
			System.out.println(string);
		}
		
	}


}
