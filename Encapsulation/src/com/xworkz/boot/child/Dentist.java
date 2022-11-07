package com.xworkz.boot.child;

import com.xworkz.Encapsulation.thing.Doctor;

public class Dentist extends Doctor {
// child,subclass,derived
// Doctor - parent,super,base

		public double fee = 1590;
		public int experiance = 13;

		
		public Dentist() {
			System.out.println("Default const of Dentist...");
		}

	}

