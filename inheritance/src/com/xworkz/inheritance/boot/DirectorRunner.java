package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.thing.Director;

public class DirectorRunner {


	public static void main(String[] args) {
		
		Director director=new Director(null, 0);
		
		Director prasanth=new Prasanth("Prasanth", 10, 25);
		
		prasanth.display();
	}

}
