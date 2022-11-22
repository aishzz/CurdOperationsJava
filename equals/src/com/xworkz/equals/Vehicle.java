package com.xworkz.equals;

public class Vehicle {
	private String name;
	private String brand;
	private String colour;
	private double price;
	private double quantity;
	private String ambasidor;
	private String manufacture;
	private double validity;
	private int lifeTime;
	private String manufactureWife;
	public Vehicle(String name, String brand, String colour, double price, double quantity, String ambasidor,
			String manufacture, double validity, int lifeTime, String manufactureWife) 
	{
		super();
		this.name = name;
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.quantity = quantity;
		this.ambasidor = ambasidor;
		this.manufacture = manufacture;
		this.validity = validity;
		this.lifeTime = lifeTime;
		this.manufactureWife = manufactureWife;
	}



	public Vehicle(String paint, String string2, String string3, int i, String string4, String krishna, int j, int k,
			int l) {
		
	}



	public String getName() {
		return name;
	}



	public void setName() {
		this.name = name;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getColour() {
		return colour;
	}



	public void setColour(String colour) {
		this.colour = colour;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public double getQuantity() {
		return quantity;
	}



	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}



	public String getAmbasidor() {
		return ambasidor;
	}



	public void setAmbasidor(String ambasidor) {
		this.ambasidor = ambasidor;
	}



	public String getManufacture() {
		return manufacture;
	}



	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}



	public double getValidity() {
		return validity;
	}



	public void setValidity(double validity) {
		this.validity = validity;
	}



	public int getLifeTime() {
		return lifeTime;
	}



	public void setLifeTime(int lifeTime) {
		this.lifeTime = lifeTime;
	}



	public String getManufactureWife() {
		return manufactureWife;
	}



	public void setManufactureWife(String manufactureWife) {
		this.manufactureWife = manufactureWife;
	}



	@Override
	public String toString() {
		return "vehicle [name=" + "Car" + ", brand=" + "BMW" + ", colour=" + "Black" + ", price=" + 4500000 + ", quantity="
				+ 100 + ", ambasidor=" + "virat" + ", manufacture=" + "krishna" + ", validity=" + 50
				+ ", lifeTime=" + 16 + ", manufactureWife=" + "rashmi" + "]";
	}



	@Override
	public boolean equals(Object other) {
		System.out.println("running equals method in Vehicle");
		if(other instanceof Paint) {
			System.out.println("other is Vehicle CAN check");
			Vehicle casted=(Vehicle)other;
			if(this.brand.equals(casted.getBrand()))
			{
				System.out.println("brand is same");
				return true;
				
			}
		}
		else {
			System.out.println("other is not Vehicle");
		}
		return false;
	}
	}

