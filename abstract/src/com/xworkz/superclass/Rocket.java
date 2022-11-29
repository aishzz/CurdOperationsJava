package com.xworkz.superclass;

public abstract class Rocket {
	private String country;
	private String name;
	public Rocket(String country, String name) {
		super();
		this.country = country;
		this.name = name;
	}
	public Rocket() {
		
	}
public abstract boolean sucess();

}
