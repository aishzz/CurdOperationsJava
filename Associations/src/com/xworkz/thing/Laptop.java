package com.xworkz.thing;

public class Laptop {
	   private String name="Hp";
       private String source="India";
       private double price=49000;
       private boolean nice=true;
       private long ip=89456;
       String color="gold";
       private String brand="hp";
    private String laptocompany="Hp";
    private String ownerName="krishna";
    private long ownerNumber=5622;
    public int ram=2;
    
    
    public String getBrand() {
    	
    	return this.brand;
    }
void setBrand(String brand) {
	this.brand=brand;


	System.out.println(laptop.getname());
	laptop.setname("mp");
	System.out.println(laptop.getname());
	
	
	System.out.println(laptop.getprice());
	laptop.setprice("78000");
	System.out.println(laptop.getprice());
	
	
	System.out.println(laptop.getip());
	laptop.setip("7");
	System.out.println(laptop.getip());
	
	
	System.out.println(laptop.getsource());
	laptop.setsource("keyboard");
	System.out.println(laptop.getsource());
	
	System.out.println(laptop.getBrand());
	laptop.setBrand("Lanovo");
	System.out.println("after modifying:"+ laptop.getBrand());
	
	
}
public String getcolor() {
	return this.color;
}
 void setcolor(String color) {
	
	 this.color=color;
	 
 }
	
 
 public String getlaptopcompany() {
	 return this.laptocompany;
 }
 
 void setlaptopcompany(String laptopcompany) {
	 this.laptocompany=laptopcompany;
	 
	 
 }
 
 public long getip() {
	 return this.ip;
 }
 
 
 
 
 
 
 
 
}
