package com.xworkz.CurdException.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.CurdException.dto.SanitizerDTO;

public class SanitizerRunner 
{
	public static void main(String[] args) 
	{
		SanitizerDTO sanitizerDTO1 = new SanitizerDTO("A1", "KRISHNA", "India", 100D);
		SanitizerDTO sanitizerDTO2 = new SanitizerDTO("A2", "AISHWARYA Pvt ltd", "Shri Lanka", 150D);
		SanitizerDTO sanitizerDTO3 = new SanitizerDTO("A3", "CHIRAG pvt ltd", "Singapore", 200D);
		SanitizerDTO sanitizerDTO4 = new SanitizerDTO("A4", "Gowri shankar pvt ltd", "Russia", 659D);
		SanitizerDTO sanitizerDTO5 = new SanitizerDTO("A5", "Raju pvt ltd", "USA", 456D);
		SanitizerDTO sanitizerDTO6 = new SanitizerDTO("A6", "Raj Vishnu pvt ltd", "South Africa", 1570D);
		SanitizerDTO sanitizerDTO7 = new SanitizerDTO("A7", "babu pvt ltd", "Jermany", 85D);
		SanitizerDTO sanitizerDTO8 = new SanitizerDTO("A8", "gopi pvt ltd", "Australia", 93D);
		SanitizerDTO sanitizerDTO9 = new SanitizerDTO("A9", "raj gopal pvt ltd", "China", 2145D);
		SanitizerDTO sanitizerDTO10 = new SanitizerDTO("A10", "Upma kumar pvt ltd", "Argentina", 382D);

		Collection<SanitizerDTO> collection=new LinkedList<SanitizerDTO>();
		collection.add(sanitizerDTO1);
		collection.add(sanitizerDTO2);
		collection.add(sanitizerDTO3);
		collection.add(sanitizerDTO4);
		collection.add(sanitizerDTO5);
		collection.add(sanitizerDTO6);
		collection.add(sanitizerDTO7);
		collection.add(sanitizerDTO8);
		collection.add(sanitizerDTO9);
		collection.add(sanitizerDTO10);
		
		Iterator<SanitizerDTO> ref=collection.iterator();
		while(ref.hasNext())
		{
			SanitizerDTO element=ref.next();
			System.out.println("element:"+element);
			System.out.println(System.lineSeparator());
			if(element.getPrice()>5) {
				System.out.println("sanitizer price greater than 5:"+element.getId());
			}
		}
		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> ref1=collection.iterator();
		while(ref1.hasNext()) {
			SanitizerDTO element=ref1.next();
			if(element.getId()==null || element.getId()==null || element.getId()==null || element.getCountry()==null) {
				System.out.println("element which has null property:"+element);
			}
		
	   }
		System.out.println(System.lineSeparator());
		Iterator<SanitizerDTO> ref2=collection.iterator();
		while(ref2.hasNext()) 
		{
			SanitizerDTO element=ref2.next();
		if("green".equals(element.getCountry()) || "red".equals(element.getCountry()) ||"blue".equals(element.getCountry())) {
			System.out.println("removing:"+element);
			ref2.remove();
		   }
		}
	}
}
		
		
		
		
		