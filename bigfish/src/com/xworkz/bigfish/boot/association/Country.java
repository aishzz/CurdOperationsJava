package com.xworkz.bigfish.boot.association;

public class Country {
	public String name;
	public City[] cities;
	public President president;
	public void setCities(City[] cities) {
		this.cities=cities;
	}
	public void setPresident(President president) {
		this.president=president;
	}
	public Country(String name) 
	{
		this.name=name;
    }
   public void display() {
	System.out.println("display details");
	System.out.println(this.name);
	if(cities!=null)
	{
	for(int i=0;i<cities.length;i++)
	{
		City city=cities[i];
		System.out.println(city);	
	}
	if(City!=null) {
		City.display();
	}
	else {
		System.out.println("city is null");
		
	}
	}
	}
   else
   {
	   System.out.println("city is null");
	   
   }
   if(this.president!=null)
   {
	   System.out.println(this.president);
	   this.president.showOff();
	   
   }
   else
   {
	   System.out.println("city null");
   }
   
}
   
}