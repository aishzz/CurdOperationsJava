package com.xworkz.thing.boot;

public class LaptopType {
public Laptop laptop;
public void funyLaptop(Laptop laptop) {
	System.out.println(laptop.getcolor());
	laptop.setcolor("blue");
	System.out.println("modified color"+laptop.getcolor());
	
	System.out.println(laptop.getip());
	laptop.setcolor("5654");
	System.out.println(laptop.getip());

	System.out.println(laptop.getlaptopcompany());
	laptop.setlaptopcompany("lenovo");
	System.out.println(laptop.getlaptopcompany);
	
	System.out.println(laptop.getname());
	laptop.setname("lenevo123");
	System.out.println(laptop.getname());

	





}
}
