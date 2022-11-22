package com.xworkz.equals.boot;

import com.xworkz.equals.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint paint = new Paint("Asian","Virat", null, 100, 0,"kshna", null,1000, 0, null);
		paint.setBrand("Asian");
		paint.setAmbasidor("Virat");
		paint.setColour(null);
		paint.setLifeTime(10);
		paint.setManufacture("kshna");
		paint.setName();
		paint.setPrice(1000);
		paint.setQuantity(0);
		paint.setValidity(0);
		
Paint paint2=new Paint(" asian","virat","orange",10,"krishna","paint",1000,10,4);
System.out.println(paint2);
boolean same=paint.equals(paint2);
System.out.println(same);
	}

}
